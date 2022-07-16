package com.sofka.entities;

import com.sofka.abstractclasses.User;

public class Professor extends User {

    public Professor(String DNI, String name, String age) {
        super(DNI, name, age);
    }

    @Override
    protected void setId() {
        this.id = "P-"+DNI;
    }
}

