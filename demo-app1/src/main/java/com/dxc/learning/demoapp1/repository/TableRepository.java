package com.dxc.learning.demoapp1.repository;

import com.dxc.learning.demoapp1.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends TableRepository<Person, Integer>{
    List<Person> findById(Id Id);
    List<Person> findByname(name name);
    List<Person> findBydob(dob dob);
    List<Person> findByEmail(Email email);
    List<Person> findByAddress(Address Address);
    
}
