package com.sofka.menu;

import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;
import com.sofka.utils.IO.IO;
import com.sofka.utils.filter.Filter;
import com.sofka.utils.hourmeter.HourMeter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBicycle {
    ArrayList<Ticket> tickets = IO.readTickets();
    ArrayList<Bicycle> bicycles = IO.readBicycles();
    Ticket ticket;
    //Instantiates filter class to execute filters
    Filter<Bicycle> filter = new Filter<>();

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert ticket id: ");
        String inputTicketId = scanner.nextLine();
        scanner.nextLine();
        for (Ticket t :tickets) {
            if(t.getId().equalsIgnoreCase(inputTicketId)){
                System.out.println("Insert if have helmet (true - false): ");
                boolean haveHelmet =scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("Insert is in good condition (true - false): ");
                boolean isInGoodCondition = scanner.nextBoolean();
                scanner.nextLine();
                String startTime = t.getStartTime();
                String endTime = String.valueOf(LocalDateTime.now()).substring(11,19);

                int delay = HourMeter.difference(startTime,endTime);
                t.setDelay(delay);
                t.setEndTime(endTime);
                t.setInGoodCondition(isInGoodCondition);
                t.setHaveHelmet(haveHelmet);
                t.confirmStatus();
            }
        }


        System.out.println(tickets);
        System.out.println("despues de cambiar: "+IO.readTickets());

        IO.updateTickets(tickets);
        System.out.println("Lector: "+IO.readTickets());

        System.out.println("Lector 2: "+IO.readTickets());
        //System.out.println("Bicycle " +ticket.getBicycle().getId()+  " returned successfully\n" +
          //      "-----------------------\n");
        BiciUMenu.mainMenu();

    }

    private void updateBicycleState(Bicycle bicycle){
        for (Bicycle b:bicycles) {
            if(b.getId().equalsIgnoreCase(bicycle.getId())){
                b.setAvailable(true);
            }
        }
        IO.updateBicycle(bicycles);
    }
}
