package org.example.cleanarchspringbootds4.presentation.controllers;

import lombok.RequiredArgsConstructor;
import org.example.cleanarchspringbootds4.application.gateways.QuoteGateway;
import org.example.cleanarchspringbootds4.domain.model.QuoteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotes")
@RequiredArgsConstructor
public class QuoteController {
    private final QuoteGateway quoteGateway;

    @GetMapping("/random")
    public ResponseEntity<QuoteModel> getRandomQuote() {
        return ResponseEntity.ok(quoteGateway.getRandomQuote());
    }
}
