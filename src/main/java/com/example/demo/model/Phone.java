package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    // Геттеры и сеттеры
    public Long getId() { return id; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public Person getPerson() { return person; }
    public void setPerson(Person person) { this.person = person; }
}