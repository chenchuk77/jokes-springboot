package com.kukinet.springboot.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl(){
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
