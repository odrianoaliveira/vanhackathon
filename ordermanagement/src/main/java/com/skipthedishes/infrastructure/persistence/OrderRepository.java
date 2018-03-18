package com.skipthedishes.infrastructure.persistence;

import com.skipthedishes.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    Optional<List<Order>> findByCustomerId(Long customerId);
}
