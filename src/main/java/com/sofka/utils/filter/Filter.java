package com.sofka.utils.filter;

import com.sofka.entities.abstractclasses.User;
import com.sofka.menu.BiciU;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

public class Filter<T> {
    //Bicycle filter
    public T filterRandomBicycleByType(ArrayList<T> array, Predicate<T> predicate){
        ArrayList<T> filteredArray = new ArrayList<T>();
        for (T object: array) {
            if (predicate.test(object)) {
                filteredArray.add(object);
            }
        }

        Random random = new Random();
        int int_random = random.nextInt(filteredArray.size());

        return filteredArray.get(int_random);
    }

    public User filterUserById(ArrayList<User> users, String id){
        User user;
        for (User u: users) {
            if(u.getId().equalsIgnoreCase(id)){
                user = u;
                return user;
            }else{
                System.out.println("The user doesn't exist. Please create user");
                BiciU.mainMenu();
            }
        }
        return null;
    }
}
