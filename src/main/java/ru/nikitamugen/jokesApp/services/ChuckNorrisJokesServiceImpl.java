package ru.nikitamugen.jokesApp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("chuck")
public class ChuckNorrisJokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public ChuckNorrisJokesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
