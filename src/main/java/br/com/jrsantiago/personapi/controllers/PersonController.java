package br.com.jrsantiago.personapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.jrsantiago.personapi.dto.response.MessageResponseDTO;
import br.com.jrsantiago.personapi.models.Person;
import br.com.jrsantiago.personapi.services.PersonService;

@RestController
@RequestMapping("/api/v1/pessoas")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO create(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping
    public List<Person> listAll() {
        return personService.findAll();
    }
}
