package org.example.cleanarchspringbootds4.infrastructure.mappers;

import org.example.cleanarchspringbootds4.domain.model.QuoteModel;
import org.example.cleanarchspringbootds4.infrastructure.persistence.entity.QuoteEntity;

public interface QuoteEntityMapper {
    QuoteModel toDomain(QuoteEntity entity);
    QuoteEntity toEntity(QuoteModel model);
}
