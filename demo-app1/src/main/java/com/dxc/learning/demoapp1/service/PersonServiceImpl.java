package com.dxc.learning.demoapp1.service;

import java.util.List;
import com.dxc.learning.demoapp1.model.User;
import com.dxc.learning.demoapp1.repository.pesronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private personRepository personRepository;

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public Person getPersonByEmail(String email) {

        return null;
    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePersonint id) {
        Person person = getPersonById(id);
        personRepository.delete(person);

    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}
