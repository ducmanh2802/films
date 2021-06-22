package com.manhdd.films.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.manhdd.films.model.Film;

@Controller
@RequestMapping(value = "/")
public class FilmController {
    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("name", "abc");
        return "index";
    }

    @GetMapping("/films")
    public String listBooks(Model model) {
        List<Film> films = List.of(new Film("Titanic","Lang man", "James Cameron" , 1992), new Film("Game of Thrones","hanh dong", " David Benioff ", 2021),
                new Film("Fast and Fourious","hanh dong", "Justin Lin", 2020));
        model.addAttribute("films", films);
        return "film";
    }
}