package br.com.jrsantiago.personapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jrsantiago.personapi.dto.MessageResponseDTO;
import br.com.jrsantiago.personapi.models.Person;
import br.com.jrsantiago.personapi.repository.PersonRepositry;

@Service
public class PersonService {
    private PersonRepositry personRepositry;

    @Autowired
    public PersonService(PersonRepositry personRepositry) {
        this.personRepositry = personRepositry;
    }

    public MessageResponseDTO save(Person person) {
        Person savedPerson = personRepositry.save(person);

        return MessageResponseDTO.builder().message("Pessoa criada com ID " + savedPerson.getId()).build();
    }

}
