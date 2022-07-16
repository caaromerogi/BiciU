package com.sofka.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Filter<T> {
    //Bicycle filter
    public T filterBicycleByType(ArrayList<T> array, Predicate<T> predicate){
        ArrayList<T> filteredArray = new ArrayList<T>();
        Iterator<T> it = array.iterator();
        while (it.hasNext()) {
            if (predicate.test((T)it.next())){
                filteredArray.add(it.next());
            }
        }
        int index = (int) Math.random()* filteredArray.size();

        return filteredArray.get(index);
    }
}
