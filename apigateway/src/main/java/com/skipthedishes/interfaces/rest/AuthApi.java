package com.skipthedishes.interfaces.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by adriano on 18/03/18.
 *
 * @author Adriano Oliveira
 */

@RestController
@RequiredArgsConstructor
public class AuthApi {
    private final PasswordEncoder passwordEncoder;

    @Data
    @AllArgsConstructor
    @Builder
    static private class Phrase {
        String phrase;
        String hashedPhrase;
    }

    @PostMapping(value = "/encode",
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    ResponseEntity<Phrase> encode(@RequestBody Phrase phrase) {
        phrase.hashedPhrase = passwordEncoder.encode(phrase.phrase);
        return ResponseEntity.status(HttpStatus.CREATED).body(phrase);
    }
}
