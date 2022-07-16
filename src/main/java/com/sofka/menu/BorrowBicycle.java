package com.sofka.menu;

import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;
import com.sofka.filter.Filter;
import com.sofka.serializer.Deserializer;
import com.sofka.serializer.Serializer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;

public class BorrowBicycle {
    //NO HACER METODOS ESTÁTICOS, MEJOR INSTANCIAR NEW BORROWBICYCLE.METODO
    public void menu(){
        Deserializer<Ticket> deserializer = new Deserializer<>();
        Serializer<Ticket> serializer = new Serializer<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";

        tickets = deserializer.deserialize(path);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your ID: ");
        String inputId = scanner.nextLine();
        //Check doubt
        //iterator object
        Iterator<Ticket> ticket = tickets.iterator();
        while (ticket.hasNext()) {
            if (ticket.next().getId().equalsIgnoreCase(inputId) && ticket.next().getStatus().equalsIgnoreCase("pending") && ticket.next().getAmount()>0){

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
                break;
        }
    }

    private Bicycle getBicycle(Predicate<Bicycle> predicate) {
        //Get the bicycles array from txt
        Deserializer<Bicycle> deserializer = new Deserializer<>();
        Serializer<Bicycle> serializer = new Serializer<>();
        ArrayList<Bicycle> bicycles = new ArrayList<>();

        //Instantiates filter object
        Filter<Bicycle> filter = new Filter<>();

        String path = "src\\main\\resources\\data\\bicycles\\bicycles.txt";
        bicycles = deserializer.deserialize(path);
        Bicycle bicycle = filter.filterBicycleByType(bicycles, predicate);

        if(bicycle == null){
            System.out.println("There are no "+ bicycle.getType() + " available");
            returnBicycleType();
        }

        return bicycle;
    }


}
