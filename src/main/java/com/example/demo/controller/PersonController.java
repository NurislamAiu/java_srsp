package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/save")
    public Person savePerson(@RequestParam String name, @RequestParam int age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    @GetMapping("/by-name")
    public List<Person> getByName(@RequestParam String name) {
        return personRepository.findByName(name);
    }

    @GetMapping("/older-than")
    public List<Person> getOlderThan(@RequestParam int age) {
        return personRepository.findByAgeGreaterThan(age);
    }
}