package org.example.cleanarchspringbootds4.infrastructure.persistence.repository;

import org.example.cleanarchspringbootds4.infrastructure.persistence.entity.QuoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface QuoteRepository extends JpaRepository<QuoteEntity, Long> {

    @Query(value = "SELECT * FROM quotes ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<QuoteEntity> findRandomEntity();
}
