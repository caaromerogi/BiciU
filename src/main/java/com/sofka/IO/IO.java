package com.sofka.IO;

import com.sofka.abstractclasses.User;
import com.sofka.entities.Bicycle;
import com.sofka.entities.Ticket;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class IO {
    public static void writeUser(User user){
        String path = "src\\main\\resources\\data\\users\\users.txt";
        Serializer<User> serializer= new Serializer<User>();
        serializer.serialize(path, user);
    }

    public static void writeTicket(Ticket ticket){
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";
        Serializer<Ticket> serializer = new Serializer<Ticket>();
        serializer.serialize(path, ticket);
    }

    //retorna el ticket
    public static ArrayList<Ticket> readTickets(){
        String path = "src\\main\\resources\\data\\tickets\\tickets.txt";
        Deserializer<Ticket> deserializer = new Deserializer<>();
        ArrayList<Ticket> tickets = deserializer.deserialize(path);
        return tickets;
    }

    public static ArrayList<Bicycle> readBicycles(){
        Deserializer<Bicycle> deserializer = new Deserializer<>();
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        String path = "src\\main\\resources\\data\\bicycles\\bicycles.txt";
        bicycles = deserializer.deserialize(path);

        return bicycles;
    }
}
