package com.skipthedishes.application;

import com.skipthedishes.infrastructure.persistence.StoreRepository;
import com.skipthedishes.model.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository repository;

    public Store create(final Store store) {
        return repository.save(store);
    }

    public Optional<Store> retrieve(final String storeId) {
        return Optional.ofNullable(repository.findOne(storeId));
    }
}
