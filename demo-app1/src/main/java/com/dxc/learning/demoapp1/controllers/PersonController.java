package com.dxc.learning.demoapp1.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.dxc.learning.demoapp1.dto.PersonDTO;
import com.dxc.learning.demoapp1.model.User;
import com.dxc.learning.demoapp1.service.PersonService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping({"", "/"})
    public ResponseEntity<List<Person>> getAll() {
        List<Person> persons = personService.getAllPersons();
        return ResponseEntity.status(HttpStatus.OK).body(persons);
    }

    @PostMapping({"", "/"})
    public ResponseEntity<PersonDTO> create(@RequestBody PersonDTO personReqObj) {
        Person person = modelMapper.map(personReqObj, Person.class);
        person.setCreationDate(LocalDate.now());
        personService.createPerson(person);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

}
@PutMapping("/persons/{id}")
  public Person replacePerson(@RequestBody Person newPerson, @PathVariable Integer id) {

    return repository.findById(id) {
            person.setname(newPerson.getName());
            person.setEmail(newPerson .getEmail());
            person.setdob(dob.now());
            person.setAddress(newPerson .getAddress());
          return repository.save(Person);
        })
        .orElseGet(() -> {
          newPerson.setId(id);
          return repository.save(newPerson);
        });
  }

  @DeleteMapping("/persons/{id}")
 public void deletePerson(@PathVariable Integer id) {
    repository.deleteById(id);
  }
}