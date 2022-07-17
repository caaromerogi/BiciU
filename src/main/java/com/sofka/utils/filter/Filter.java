package com.sofka.utils.filter;

import com.sofka.entities.Ticket;
import com.sofka.entities.abstractclasses.User;
import com.sofka.menu.BiciUMenu;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;

public class Filter<T> {
    //Bicycle filter
    public T filterRandomBicycleByType(ArrayList<T> array, Predicate<T> predicate) {
        ArrayList<T> filteredArray = new ArrayList<T>();
        for (T object : array) {
            if (predicate.test(object)) {
                filteredArray.add(object);
            }
        }
        Random random = new Random();
        int int_random = random.nextInt(filteredArray.size());

        return filteredArray.get(int_random);
    }

    public User filterUserById(ArrayList<User> users, String id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equalsIgnoreCase(id)) {
                user = u;
                return user;
            }
        }
        System.out.println("The user id inserted doesn't exist");
        BiciUMenu.mainMenu();
        return null;
    }

    public Ticket filterTicketById(ArrayList<Ticket> tickets, String id) {
        Ticket ticket = null;
        for (Ticket t : tickets) {
            if (t.getId().equalsIgnoreCase(id)) {
                ticket = t;
                return ticket;
            }
        }
        System.out.println("The ticket id inserted doesn't exist");
        BiciUMenu.mainMenu();
        return null;
    }

    public ArrayList<T> filterTicket(ArrayList<T> array, Predicate<T> predicate) {
        ArrayList<T> filteredArray = new ArrayList<T>();
        for (T object : array) {
            if (predicate.test(object)) {
                filteredArray.add(object);
            }
        }

        return filteredArray;
    }
}
