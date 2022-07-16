package com.sofka.menu;

import com.sofka.IO.IO;
import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;
import com.sofka.filter.Filter;
import com.sofka.IO.Deserializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class BorrowBicycle {

    public void menu(){
        ArrayList<Ticket> tickets = IO.readTickets();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your ID: ");
        String inputId = scanner.nextLine();

        Iterator<Ticket> ticket = tickets.iterator();
        while (ticket.hasNext()) {
            if (ticket.next().getId().equalsIgnoreCase(inputId) && ticket.next().getStatus().equalsIgnoreCase("pending") && ticket.next().getAmount()>0){
                //mostrar la deuda
                System.out.println("You have a doubt. Ticket ID: "+ticket.next().getId());
            }else {
                returnBicycleType();
            }
        }
    }

    private void returnBicycleType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a bicycle Mountain (M) - Road (R): ");
        String inputId = scanner.nextLine();

        Bicycle bicycle;

        switch (inputId.toUpperCase()){
            case "M":
                bicycle = getBicycle(b-> b.getType().equals("Mountain") && b.isAvailable());
                System.out.println(bicycle);
                break;
            case "R":
                bicycle =getBicycle(b-> b.getType().equals("Road") && b.isAvailable());
                System.out.println(bicycle);
                break;
            default:
                returnBicycleType();
                assignTicket();
                break;
        }
    }

    private Bicycle getBicycle(Predicate<Bicycle> predicate) {
        //Get the bicycles array from txt
        ArrayList<Bicycle> bicycles = IO.readBicycles();

        //Instantiates filter object
        Filter<Bicycle> filter = new Filter<>();

        Bicycle bicycle = filter.filterRandomBicycleByType(bicycles, predicate);

        if(bicycle == null){
            System.out.println("There are no "+ bicycle.getType() + " available");
            returnBicycleType();
        }
        return bicycle;
    }

    private void assignTicket(){

    }

}
