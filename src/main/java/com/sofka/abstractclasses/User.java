package com.sofka.abstractclasses;

import java.io.Serializable;

public abstract class User implements Serializable {
    protected String id;
    protected String DNI;
    protected String name;
    protected String age;


    public User(String DNI, String name, String age) {
        this.DNI = DNI;
        this.name = name;
        this.age = age;
        setId();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    protected abstract void setId();
}
