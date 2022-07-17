package com.sofka.entities.abstractclasses;

import java.io.Serializable;

public abstract class User implements Serializable  {
    protected String id;
    protected String DNI;
    protected String name;
    protected String age;


    public User(String DNI, String name, String age) {
        setId();
        this.DNI = DNI;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID = " + id + '\n' +
                "Name = " + name + '\n' +
                "Age = " + age;
    }

    protected abstract void setId();

    public String getId() {
        return id;
    }

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
