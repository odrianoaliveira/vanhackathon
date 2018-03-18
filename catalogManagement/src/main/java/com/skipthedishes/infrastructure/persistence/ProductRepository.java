package com.skipthedishes.infrastructure.persistence;

import com.skipthedishes.model.Product;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
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
public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<List<Product>> findBy(TextCriteria criteria);
}
