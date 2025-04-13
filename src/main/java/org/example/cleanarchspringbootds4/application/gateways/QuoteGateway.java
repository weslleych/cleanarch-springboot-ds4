package org.example.cleanarchspringbootds4.application.gateways;

import org.example.cleanarchspringbootds4.domain.model.QuoteModel;

public interface QuoteGateway {
    QuoteModel getRandomQuote();
}
