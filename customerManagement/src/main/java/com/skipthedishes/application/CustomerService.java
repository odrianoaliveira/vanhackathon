package com.skipthedishes.application;

import com.skipthedishes.infrastructure.persistence.CustomerRepository;
import com.skipthedishes.model.Customer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Customer create(final Customer customer) {
        return repository.save(customer);
    }

    public Optional<Customer>  retrieve(final String customerId) {
        return Optional.ofNullable(repository.findOne(customerId));
    }
}
