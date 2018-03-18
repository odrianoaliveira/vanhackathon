package com.skipthedishes.application;

import com.skipthedishes.infrastructure.feign.CatalogClient;
import com.skipthedishes.infrastructure.feign.CustomerClient;
import com.skipthedishes.infrastructure.persistence.OrderRepository;
import com.skipthedishes.model.Customer;
import com.skipthedishes.model.Order;
import com.skipthedishes.model.OrderItem;
import com.skipthedishes.model.Product;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrderRepository repository;
    private final CustomerClient customerClient;
    private final CatalogClient catalogClient;

    public Optional<Order> retrive(final String id) {
        return Optional.ofNullable(repository.findOne(id));
    }

    public Optional<List<Order>> retriveCustomerOrders(final Long customerId) {
        return repository.findByCustomerId(customerId);
    }

    public Order create(final Order order) {
        final Customer customer = customerClient.retrieve(order.getCustomerId());
        if(customer == null) {
            throw new CustomerNotFoundException(order.getCustomerId());
        }

        order.getOrderItems()
                .forEach(this::orderItemValidation);

        return repository.save(order);
    }

    public Optional<Order> update(final String orderId, final Order order) {
        Optional<Order> currentOrder = Optional.ofNullable(repository.findOne(orderId));
        return currentOrder.map(o -> repository.save(order));
    }

    private void orderItemValidation(final OrderItem ordetItem) {
        try {
            final Product product = catalogClient.retrieveProduct(ordetItem.getProductId());
            log.trace("Product [{}]", product);
        } catch (FeignException ex) {
            if(ex.status() == 404) {
                throw new ProductNotFoundException(ordetItem.getProductId());
            } else {
                throw new RuntimeException("Error trying to get product.");
            }
        }
    }
}
