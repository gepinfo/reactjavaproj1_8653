package com.geppetto.reactjavaproj1.dao;

import java.util.Optional;
import com.geppetto.reactjavaproj1.model.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface PersonDao {

    Optional<Person> getPersonById(String id);

    Person createPerson(Person person);

    void deletePerson(String id);

    Optional<Person> updatePerson(String id);

    Page<Person> getAllPerson(Pageable pageable);

}

