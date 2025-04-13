package org.example.cleanarchspringbootds4.infrastructure.service;

import lombok.RequiredArgsConstructor;
import org.example.cleanarchspringbootds4.application.gateways.QuoteGateway;
import org.example.cleanarchspringbootds4.domain.model.QuoteModel;
import org.example.cleanarchspringbootds4.presentation.mappers.QuoteEntityMapper;
import org.example.cleanarchspringbootds4.infrastructure.persistence.repository.QuoteRepository;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class QuoteService implements QuoteGateway {

    private final QuoteRepository quoteRepository;
    private final QuoteEntityMapper quoteMapper;

    @Override
    public QuoteModel getRandomQuote() {
        return quoteRepository.findRandomEntity()
                .map(quoteMapper::toDomain)
                .orElseThrow(() -> new RuntimeException("No quotes available"));
    }
}
