package com.sofka.menu;
import com.sofka.serializer.Serializer;
import com.sofka.test.User;

import java.util.Scanner;

public class CreateUser {

    public void menu(){
        Serializer<User> serializer= new Serializer<User>();
        String path = "src\\main\\resources\\data\\users\\users.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce S for Student");
        String optionInput = scanner.nextLine();
        switch (optionInput.toLowerCase()) {
            case "s":
                //Instantiates a student
                String DNI = scanner.nextLine();
                String name = scanner.nextLine();
                String age = scanner.nextLine();
                User user = new User(DNI, name, age, "S");
                //Serializer
                serializer.serialize(path, user);
                //Can I overwrite a file?
                break;
            case "p":
                //Instantiates a professor
                break;
            default:
                menu();
        }
    }
}
