package com.sofka.utils.IO;

import com.sofka.entities.abstractclasses.User;
import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class IO {
    public static void writeUser(User user){
        String path = "src\\main\\resources\\data\\users\\users.txt";
        Serializer<User> serializer= new Serializer<User>();
        serializer.serialize(path, user);
    }

    public static ArrayList<User> readUser(){
        String path = "src\\main\\resources\\data\\users\\users.txt";
        Deserializer<User> deserializer = new Deserializer<>();
        return deserializer.deserialize(path);
    }

    public static void writeTicket(Ticket ticket){
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";
        Serializer<Ticket> serializer = new Serializer<Ticket>();
        serializer.serialize(path, ticket);
    }

    public static void writeTicketArray(ArrayList<Ticket> tickets){
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";
        Serializer<Ticket> serializer = new Serializer<Ticket>();
        Iterator<Ticket> it = tickets.iterator();
        for (Ticket t:tickets) {
            serializer.serialize(path, t);
        }
    }

    //retorna el ticket
    public static ArrayList<Ticket> readTickets(){
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";
        Deserializer<Ticket> deserializer = new Deserializer<>();
        return deserializer.deserialize(path);
    }

    public static ArrayList<Bicycle> readBicycles(){
        Deserializer<Bicycle> deserializer = new Deserializer<>();
        String path = "src\\main\\resources\\data\\bicycles\\bicycles.txt";
        return deserializer.deserialize(path);
    }

    public static void writeBicycle(ArrayList<Bicycle> bicycles){
        Serializer<Bicycle> serializer = new Serializer<>();
        String path = "src\\main\\resources\\data\\bicycles\\bicycles.txt";
        Iterator<Bicycle> it = bicycles.iterator();
        while (it.hasNext()) {
            serializer.serialize(path, it.next());
        }
    }

    public static void updateBicycle(ArrayList<Bicycle> bicycles){
        String path = "src\\main\\resources\\data\\bicycles\\bicycles.txt";
        File file = new File(path);
        file.delete();

        IO.writeBicycle(bicycles);
    }

    public static void updateTickets(ArrayList<Ticket> tickets){
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";
        File file = new File(path);
        file.delete();

        IO.writeTicketArray(tickets);
    }
}
