package com.sofka.menu;
import java.util.Scanner;

public class createUser {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        String optionInput = scanner.nextLine();
        switch (optionInput.toLowerCase()) {
            case "s":
                break;
            case "p":
                break;
            default:
                menu();
        }
    }
}
