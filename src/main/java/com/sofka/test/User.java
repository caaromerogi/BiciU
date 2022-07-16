package com.sofka.test;

import java.io.Serializable;

public class User implements Serializable {
    private String DNI;
    private String name;
    private String age;
    private String type;

    public User(String DNI, String name, String age, String type) {
        this.DNI = DNI;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "DNI='" + DNI + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
