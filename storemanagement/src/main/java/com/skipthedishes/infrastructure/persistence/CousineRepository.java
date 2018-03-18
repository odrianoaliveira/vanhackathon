package com.skipthedishes.infrastructure.persistence;

import com.skipthedishes.model.Cousine;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@Repository
public interface CousineRepository extends MongoRepository<Cousine, String> {
    Optional<List<Cousine>> findBy(TextCriteria criteria);
}
