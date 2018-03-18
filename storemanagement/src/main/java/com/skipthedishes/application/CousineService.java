package com.skipthedishes.application;

import com.skipthedishes.infrastructure.persistence.CousineRepository;
import com.skipthedishes.model.Cousine;
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
public class CousineService {
    private final CousineRepository repository;

    public Cousine create(final Cousine store) {
        return repository.save(store);
    }

    public Optional<Cousine> retrieve(final String cousineId) {
        return Optional.ofNullable(repository.findOne(cousineId));
    }

    public Optional<List<Cousine>> search(String searchText) {
        TextCriteria criteria = new TextCriteria();
        criteria.matching(searchText);
        return repository.findBy(criteria);
    }
}
