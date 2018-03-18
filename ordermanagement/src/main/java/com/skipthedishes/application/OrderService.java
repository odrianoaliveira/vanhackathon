package com.skipthedishes.application;

import com.skipthedishes.infrastructure.feign.CustomerClient;
import com.skipthedishes.infrastructure.persistence.OrderRepository;
import com.skipthedishes.model.Customer;
import com.skipthedishes.model.Order;
import lombok.RequiredArgsConstructor;
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
public class OrderService {
    private final OrderRepository repository;
    private final CustomerClient customerClient;

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
        return repository.save(order);
    }

    public Optional<Order> update(final String orderId, final Order order) {
        Optional<Order> currentOrder = Optional.ofNullable(repository.findOne(orderId));
        return currentOrder.map(o -> repository.save(order));
    }
}
