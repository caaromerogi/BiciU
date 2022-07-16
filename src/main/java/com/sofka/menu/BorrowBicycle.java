package com.sofka.menu;

import com.sofka.entities.Ticket;
import com.sofka.serializer.Deserializer;
import com.sofka.serializer.Serializer;

import java.util.ArrayList;
import java.util.Scanner;

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

        for (Ticket ticket : tickets) {
            if(ticket.getId().equalsIgnoreCase(inputId) && ticket.getStatus().equalsIgnoreCase("pending") && ticket.getAmount()>0){
                //return the ticket
                //Mostrar deuda - No puede prestar hasta que pague
            }else {
                //No tickets available
                //Continue the code - bicycle type
                bicycleType();
            }
        }
    }

    private void bicycleType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a bicycle Mountain (M) - Road (R): ");
        String inputId = scanner.nextLine();

        switch (inputId.toUpperCase()){
            case "M":
                break;
            case "R":
                break;
            default:
                bicycleType();

        }
    }


}
