package com.sofka.menu;

import java.util.Scanner;

public class BiciUMenu {

    public static void mainMenu(){
        System.out.println("Bici-U Main Menu\n" +
                "1. Register User\n" +
                "2. Borrow Bicycle\n" +
                "3. Return Bicycle\n" +
                "4. Pay tickets \n" +
                "5. Tickets history\n" +
                "6. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option: ");
        String optionInput = scanner.nextLine();
        switch (optionInput) {
            case "1":
                new CreateUser().menu();
                break;
            case "2" :
                new BorrowBicycle().menu();
                break;
            case "3":
                new ReturnBicycle().menu();
                break;
            case "4":
                new PayTicket().menu();
                break;
            case "5":
                new TicketHistory().menu();
                break;
            case "6":
                System.out.println("See you later, bye!");
                System.exit(0);
                break;
            default :
                new BiciUMenu().mainMenu();
                break;
        }
    }
}
