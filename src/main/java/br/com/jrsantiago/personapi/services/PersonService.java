package br.com.jrsantiago.personapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jrsantiago.personapi.models.Person;
import br.com.jrsantiago.personapi.repository.PersonRepositry;

@Service
public class PersonService {
    private PersonRepositry personRepositry;

    @Autowired
    public PersonService(PersonRepositry personRepositry) {
        this.personRepositry = personRepositry;
    }

    public Person save(Person person) {
        return personRepositry.save(person);
    }

}
