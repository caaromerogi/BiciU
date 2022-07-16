package com.sofka.test;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("12", "carlos", "21", "s");
        Bicycle bicycle1 = new Bicycle("BIC-01" ,"Mountain","red",true);
        Ticket t1 = new Ticket(bicycle1, user1, "a", "b", "c", true, true, "active", 1);

        User user2 = new User("34", "jose", "21", "s");
        Bicycle bicycle2 = new Bicycle("BIC-02" ,"Mountain","red",true);
        Ticket t2 = new Ticket(bicycle2, user2, "a", "b", "c", true, true, "active", 1);

        User user3 = new User("56", "raul", "21", "s");
        Bicycle bicycle3 = new Bicycle("BIC-03" ,"Mountain","red",true);
        Ticket t3 = new Ticket(bicycle3, user3, "a", "b", "c", true, true, "active", 1);

        User user4 = new User("78", "antonio", "21", "s");
        Bicycle bicycle4 = new Bicycle("BIC-04" ,"Mountain","red",true);
        Ticket t4 = new Ticket(bicycle4, user4, "a", "b", "c", true, true, "active", 1);

        try {
            FileInputStream fileInput = new FileInputStream("test.txt");
            ObjectInputStream oi = new ObjectInputStream(fileInput);

            boolean control = true;
            while (control) {
                try {
                    Ticket ticket = (Ticket) oi.readObject();
                    System.out.println(ticket.getUser());
                    System.out.println("______________________________");
                    System.out.println(ticket);
                    System.out.println();
                }catch (Exception e) {
                    control = false;
                    oi.close();
                    fileInput.close();
                }

            }
            System.out.println("fin");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }
}
