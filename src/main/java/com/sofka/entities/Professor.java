package com.sofka.entities;

import com.sofka.entities.abstractclasses.User;

public class Professor extends User {

    public Professor(String DNI, String name, String age) {
        super(DNI, name, age);
        setId();
    }

    @Override
    protected void setId() {
        this.id = "P-"+DNI;
    }
}

