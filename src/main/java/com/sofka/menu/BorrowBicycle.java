package com.sofka.menu;

import com.sofka.entities.abstractclasses.User;
import com.sofka.utils.IO.IO;
import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;
import com.sofka.utils.filter.Filter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class BorrowBicycle {
    Scanner scanner = new Scanner(System.in);
    //Reading tickets and bicycle .txt
    ArrayList<Ticket> tickets = IO.readTickets();
    ArrayList<Bicycle> bicycles = IO.readBicycles();
    ArrayList<User> users = IO.readUser();
    //Instantiates filter class to execute filters
    Filter<Bicycle> filter = new Filter<>();
    Bicycle selectedBicycle;
    String inputId;
    public void menu(){

        System.out.println("Introduce your ID: ");
        inputId = scanner.nextLine();
        filter.filterUserById(users,inputId);

        //Checking if user has a doubt
        Iterator<Ticket> ticket = tickets.iterator();
        while (ticket.hasNext()) {
            if (ticket.next().getId().equalsIgnoreCase(inputId)
                    && ticket.next().getStatus().equals("pending")
                    && ticket.next().getAmount()>0)
            {
                System.out.println("You have a doubt. Ticket ID: "+ ticket.next().getId()+
                        "\nAmount: "+ ticket.next().getAmount());
            }else{
                returnBicycleType();
            }
        }
        returnBicycleType();
    }

    private void returnBicycleType(){
        System.out.println("Choose a bicycle Mountain (M) - Road (R): ");
        String bicycleTypeSelected = scanner.nextLine();

        switch (bicycleTypeSelected.toUpperCase()){
            case "M":
                selectedBicycle = getMountainBicycle();
                assignTicket();
                scanner.close();
                break;
            case "R":
                selectedBicycle = getRoadBicycle();
                scanner.close();
                assignTicket();
                break;
            default:
                returnBicycleType();
                break;
        }
    }

    private Bicycle getMountainBicycle(){
        Predicate<Bicycle> condition = b -> (b.getType().equals("Mountain") && b.isAvailable());
        Bicycle bicycle = getBicycle(condition);
        if (bicycle == null){
            System.out.println("There is no Mountain bikes available. Choose another type");
            returnBicycleType();
        }
        return bicycle;
    }

    private Bicycle getRoadBicycle(){
        Predicate<Bicycle> condition = b-> (b.getType().equals("Road") && b.isAvailable());
        Bicycle bicycle = getBicycle(condition);
        if (bicycle == null){
            System.out.println("There is no Road bikes available. Choose another type");
            returnBicycleType();
        }
        return bicycle;
    }

    private Bicycle getBicycle(Predicate<Bicycle> condition) {
        return filter.filterRandomBicycleByType(bicycles, condition);
    }


    private void assignTicket(){
        User user = filter.filterUserById(users,inputId);

        String nowTime = String.valueOf(LocalDateTime.now()).substring(11,19);
        String nowDate = String.valueOf(LocalDateTime.now()).substring(0,10);

        Ticket ticket = new Ticket(tickets.size(), selectedBicycle, user,nowDate,nowTime);
        IO.writeTicket(ticket);
        System.out.println(IO.readTickets());
        //msg created

    }

}
