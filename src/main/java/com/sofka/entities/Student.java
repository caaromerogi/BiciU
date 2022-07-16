package com.sofka.entities;

import com.sofka.abstractclasses.User;

public class Student extends User {

    public Student(String DNI, String name, String age) {
        super(DNI, name, age);
    }

    @Override
    protected void setId() {
        this.id = "S-"+DNI;
    }
}
