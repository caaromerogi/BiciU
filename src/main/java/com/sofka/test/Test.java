package com.sofka.test;

import com.sofka.abstractclasses.User;
import com.sofka.menu.CreateUser;
import com.sofka.serializer.Deserializer;


public class Test {
    public static void main(String[] args) {
        CreateUser createUser = new CreateUser();
        createUser.menu();

        Deserializer<User> des = new Deserializer<>();
        System.out.println(des.deserialize("src\\main\\resources\\data\\users\\users.txt"));

    }
}
