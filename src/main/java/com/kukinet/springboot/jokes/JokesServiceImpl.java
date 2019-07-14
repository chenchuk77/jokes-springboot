package com.kukinet.springboot.jokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokesServiceImpl implements JokesService {

    ChuckNorrisQuotes quotes;

    public JokesServiceImpl(){
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
