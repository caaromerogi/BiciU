package com.sofka.menu;

import com.sofka.entities.Ticket;
import com.sofka.utils.IO.IO;
import com.sofka.utils.filter.Filter;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class TicketHistory {
    Scanner scanner = new Scanner(System.in);

    Filter filter = new Filter();
    public void menu(){
        System.out.println("5.1 Show all tickets\n" +
                "5.2 Search by code\n" +
                "5.3 Search by status\n" +
                "Select an option please: ");
        String option = scanner.nextLine();
        switch (option) {
            case "5.1":
                tableAllTickets();
                System.out.println("--------------------");
                BiciU.mainMenu();
                break;
            case "5.2":
                tableSearchByCode();
                System.out.println("--------------------");
                BiciU.mainMenu();
                break;
            case "5.3":
                tableSearchByStatus();
                System.out.println("--------------------");
                BiciU.mainMenu();
                break;
            default:
                menu();
        }
    }

    private void tableAllTickets(){
        ArrayList<Ticket> tickets = IO.readTickets();
        System.out.println("  Code     |  User ID        |   Name        |   Amount ($)  |   Status    ");
        for (Ticket ticket : tickets) {
            System.out.println("  "+ticket.getId()+"       "+ticket.getUser().getId()+"     "+ticket.getUser().getName()+"          "+ticket.getAmount()+"             "+ticket.getStatus());
        }
    }

    private  void tableSearchByStatus(){
        ArrayList<Ticket> tickets = IO.readTickets();
        System.out.println("Insert status to filter");
        String status = scanner.nextLine();
        System.out.println("  Code     |  User ID        |   Name        |   Amount ($)  |   Status    ");
        Predicate<Ticket> condition = t -> (t.getStatus().equalsIgnoreCase(status));
        ArrayList<Ticket> filteredTickets = filter.filterTicket(tickets, condition);
        for (Ticket ticket:filteredTickets) {
            System.out.println("  "+ticket.getId()+"       "+ticket.getUser().getId()+"     "+ticket.getUser().getName()+"          "+ticket.getAmount()+"             "+ticket.getStatus());
        }
    }

    private  void tableSearchByCode(){
        ArrayList<Ticket> tickets = IO.readTickets();
        System.out.println("Insert code to filter");
        String code = scanner.nextLine();
        System.out.println("  Code     |  User ID        |   Name        |   Amount ($)  |   Status    ");
        Predicate<Ticket> condition = t -> (t.getId().equalsIgnoreCase(code));
        ArrayList<Ticket> filteredTickets = filter.filterTicket(tickets, condition);
        for (Ticket ticket:filteredTickets) {
            System.out.println("  "+ticket.getId()+"       "+ticket.getUser().getId()+"     "+ticket.getUser().getName()+"          "+ticket.getAmount()+"             "+ticket.getStatus());
        }
    }
}
