package org.example.cleanarchspringbootds4.presentation.mappers;

import org.example.cleanarchspringbootds4.domain.model.QuoteModel;
import org.example.cleanarchspringbootds4.infrastructure.persistence.entity.QuoteEntity;
import org.springframework.stereotype.Component;

@Component
public class QuoteEntityMapperImpl implements QuoteEntityMapper {
    @Override
    public QuoteModel toDomain(QuoteEntity entity) {
        return new QuoteModel(entity.getId(), entity.getText(), entity.getAuthor(), entity.getSize());
    }

    @Override
    public QuoteEntity toEntity(QuoteModel model) {
        return new QuoteEntity(model.id(), model.text(), model.author(), model.size());
    }
}
