package com.venkatesh.springoot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class FilmController {

    @RequestMapping("/films")
    public List<Film> retrieveListOfFilms() {
        return Arrays.asList(
                new Film(1, "Superman", "James Gunn"),
                new Film(1, "Tenet", "Christopher Nolan")
        );
    }
}
