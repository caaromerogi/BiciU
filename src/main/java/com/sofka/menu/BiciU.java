package com.sofka.menu;

import java.util.Scanner;

public class BiciU {

    public void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        String optionInput = scanner.nextLine();
        switch (optionInput) {
            case "1":
                //createUserMenu();
                break;
            case "2" :
                //borrowBicycleMenu();
                break;
            case "3":
                //returnBicycleMenu();
                break;
            case "4":
                //payTicketsMenu();
                break;
            case "5":
                //ticketsHistory();
                break;
            case "6":
                //"Exit";
                break;
            default :
                mainMenu();
                break;
        }
    }
}
