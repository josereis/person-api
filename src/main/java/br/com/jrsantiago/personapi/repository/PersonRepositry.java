package br.com.jrsantiago.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jrsantiago.personapi.models.Person;

public interface PersonRepositry extends  JpaRepository<Person, Long> {
    
}
