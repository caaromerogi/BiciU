package com.sofka.menu;
import com.sofka.IO.IO;
import com.sofka.entities.Professor;
import com.sofka.entities.Student;
import com.sofka.IO.Serializer;
import com.sofka.abstractclasses.User;

import java.util.Scanner;

public class CreateUser {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce S for Student or P for Professor");
        String optionInput = scanner.nextLine();
        switch (optionInput.toUpperCase()) {
            case "S":
                System.out.println("Introduce your DNI:");
                String sDNI = scanner.nextLine();
                System.out.println("Introduce your name");
                String sName = scanner.nextLine();
                System.out.println("Introduce your age");
                String sAge = scanner.nextLine();
                //Instantiates a student
                User student = new Student(sDNI, sName, sAge);
                //write object in txt
                IO.writeUser(student);
                System.out.println("Usurio registrado correctamente");
                //BiciU.mainMenu();
                break;
            case "P":
                System.out.println("Introduce your DNI:");
                String pDNI = scanner.nextLine();
                System.out.println("Introduce your name");
                String pName = scanner.nextLine();
                System.out.println("Introduce your age");
                String pAge = scanner.nextLine();
                //Instantiates a professor
                User professor = new Professor(pDNI, pName, pAge);
                //Write object in txt
                IO.writeUser(professor);
                System.out.println("Usurio registrado correctamente");
                //BiciU.mainMenu();
                break;
            default:
                menu();
        }
    }
}
