package com.sofka.entities;

import com.sofka.entities.abstractclasses.User;


public class Student extends User {

    public Student(String DNI, String name, String age) {
        super(DNI, name, age);
        setId();
    }

    @Override
    public void setId() {
        this.id = "S-"+DNI;
    }
}
