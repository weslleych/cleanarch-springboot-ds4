package org.example.cleanarchspringbootds4.application.usecases;

import lombok.RequiredArgsConstructor;
import org.example.cleanarchspringbootds4.application.gateways.QuoteGateway;
import org.example.cleanarchspringbootds4.domain.model.QuoteModel;

@RequiredArgsConstructor
public class GetQuoteUseCase {

    private final QuoteGateway quoteGateway;

    public QuoteModel getRandomQuote() {
        return quoteGateway.getRandomQuote();
    }
}
