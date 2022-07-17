package com.sofka.menu;

import com.sofka.entities.Ticket;
import com.sofka.utils.IO.IO;
import com.sofka.utils.filter.Filter;

import java.util.ArrayList;
import java.util.Scanner;

public class PayTicket {
    Scanner scanner = new Scanner(System.in);
    String inputTicketId;
    ArrayList<Ticket> tickets = IO.readTickets();
    Filter filter = new Filter();
    Ticket ticket;
    public void menu(){
        System.out.println("Insert ticket Id to pay: ");
        inputTicketId=scanner.nextLine();
        ticket = filter.filterTicketById(tickets, inputTicketId);
        System.out.println(ticket);
        if(ticket.getStatus().equals("active")){
            System.out.println("The ticket inserted is active, return the bicycle to continue");
            BiciUMenu.mainMenu();
        }else {
            System.out.println("Do you want to pay the ticket? (Y/N):" );
            String payTicket = scanner.nextLine();
            switch (payTicket.toUpperCase()) {
                case "Y":
                    ticket.setStatus("OK");
                    IO.updateTickets(tickets);
                    System.out.println(IO.readTickets());
                    System.out.println("Ticked "+ticket.getId()+" paid");
                    System.out.println("-----------------------\n");
                    BiciUMenu.mainMenu();
                    break;
                case "N":
                    System.out.println("\nReturning back to main menu...\n" +
                            "------------------------");
                    BiciUMenu.mainMenu();
                    break;
                default :
                    menu();
                    break;
            }
        }
    }
}
