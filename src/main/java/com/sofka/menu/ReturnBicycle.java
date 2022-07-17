package com.sofka.menu;

import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;
import com.sofka.entities.abstractclasses.User;
import com.sofka.utils.IO.IO;
import com.sofka.utils.filter.Filter;
import com.sofka.utils.hourmeter.HourMeter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBicycle {
    ArrayList<Ticket> tickets = IO.readTickets();
    ArrayList<Bicycle> bicycles = IO.readBicycles();
    ArrayList<User> users = IO.readUser();
    //Instantiates filter class to execute filters
    Filter<Bicycle> filter = new Filter<>();
    String inputId;
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        String inputTicketId = scanner.nextLine();
        for (Ticket t:tickets) {
            if (t.getId().equalsIgnoreCase(inputTicketId)) {
                boolean haveHelmet =scanner.nextBoolean();
                scanner.nextLine();
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

            }else {
                System.out.println("The ticket id inserted doesn't exist");
                BiciU.mainMenu();
            }
        }



        //como llegó la cicla
        //si tiene casco
    }
}
