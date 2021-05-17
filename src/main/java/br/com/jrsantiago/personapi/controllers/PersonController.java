package br.com.jrsantiago.personapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PersonController {
    
    @GetMapping
    public void getPeople() {
        return "API REST Person";
    }

}
