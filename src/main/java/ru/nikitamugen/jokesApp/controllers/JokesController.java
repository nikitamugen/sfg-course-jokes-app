package ru.nikitamugen.jokesApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.nikitamugen.jokesApp.services.JokesService;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("joke", jokesService.getJoke());

        return "jokes";
    }

}
