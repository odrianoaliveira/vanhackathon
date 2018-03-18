package com.skipthedishes.infrastructure.persistence;

import com.skipthedishes.model.OrderItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Repository
public interface OrderItemRepository extends PagingAndSortingRepository<OrderItem, String> {
}
