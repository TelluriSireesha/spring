package com.dxc.learning.demoapp1.service;

import java.util.List;
import java.util.Optional;
import com.dxc.learning.demoapp1.model.Person;

public interface PersonService {

    public Person getPersonById(int id);

    public Person  getPersonByEmail(String email);

    public Person  createPerson(Person  person);

    public Person  updatePerson(Person  person);

    public void deletePerson(int id);

    public List<Person > getAllPersons();

    
}
