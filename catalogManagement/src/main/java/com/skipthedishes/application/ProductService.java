package com.skipthedishes.application;

import com.skipthedishes.infrastructure.persistence.ProductRepository;
import com.skipthedishes.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.query.TextCriteria;
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
public class ProductService {
    private final ProductRepository repository;

    public Product create(final Product product) {
        return repository.save(product);
    }

    public Optional<Product> retrieve(final String productId) {
        return Optional.ofNullable(repository.findOne(productId));
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Optional<List<Product>> search(String searchText) {
        TextCriteria criteria = new TextCriteria();
        criteria.matching(searchText);
        return repository.findBy(criteria);
    }
}
