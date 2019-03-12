package ru.nikitamugen.jokesApp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"notFunny", "default"})
public class NotFunnyJokesServiceImpl implements JokesService {

    @Override
    public String getJoke() {
        return "I don't know any one ... ¯\\_(ツ)_/¯";
    }
}
