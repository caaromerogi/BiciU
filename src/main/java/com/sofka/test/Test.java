package com.sofka.test;

import com.sofka.entities.Bicycle;
import com.sofka.menu.BiciU;
import com.sofka.menu.BorrowBicycle;
import com.sofka.menu.ReturnBicycle;
import com.sofka.utils.IO.IO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Test {
    public static void main(String[] args) {
        //CreateUser createUser = new CreateUser();
        //createUser.menu();
        /*
        "BIC-01",Mountain",red",true
        "BIC-02",Road",blue",true
        "BIC-03",Mountain",green",true
        "BIC-04",Mountain",yellow",true

        "BIC-05",Road",purple",true
        "BIC-06",Road",red",true
        "BIC-07",Mountain",red",true
        "BIC-08",Road",blue",true
        "BIC-09",Mountain",blue",true

        "BIC-10",Road",purple",true
        "BIC-11",Road",yellow",true
        "BIC-12",Mountain",blue",true
        "BIC-13",Mountain",blue",true
        "BIC-14",Mountain",red",true

        "BIC-15",Road",yellow",true
        "BIC-16",Road",yellow",true
        "BIC-17",Road",red",true
        "BIC-18",Mountain",blue",true
        "BIC-19",Road",blue",true

        "BIC-20",Mountain",purple",true
        "BIC-21",Road",red",true
        "BIC-22",Mountain",yellow",true
        "BIC-23",Mountain",red",true
        "BIC-24",Road",green",true
        "BIC-25",Road",red",true
         */
        ArrayList<Bicycle> bicycles = new ArrayList<>();

        Bicycle b1 = new Bicycle("BIC-01", "Mountain", "red", true);
        bicycles.add(b1);
        Bicycle b2 = new Bicycle("BIC-02", "Road", "blue", true);
        Bicycle b3 = new Bicycle("BIC-03", "Mountain", "green", true);

        Bicycle b4 = new Bicycle("BIC-04", "Mountain", "yellow", true);

        Bicycle b5 = new Bicycle("BIC-05", "Road", "purple", true);

        Bicycle b6 = new Bicycle("BIC-06", "Road", "red", true);

        Bicycle b7 = new Bicycle("BIC-07", "Mountain", "red", true);

        Bicycle b8 = new Bicycle("BIC-08", "Road", "blue", true);

        Bicycle b9 = new Bicycle("BIC-09", "Mountain", "blue", true);

        Bicycle b10 = new Bicycle("BIC-10", "Road", "purple", true);

        Bicycle b11 = new Bicycle("BIC-11", "Road", "yellow", true);

        Bicycle b12 = new Bicycle("BIC-12", "Mountain", "blue", true);

        Bicycle b13 = new Bicycle("BIC-13", "Mountain", "blue", true);

        Bicycle b14 = new Bicycle("BIC-14", "Mountain", "red", true);

        Bicycle b15 = new Bicycle("BIC-15", "Road", "yellow", true);

        Bicycle b16 = new Bicycle("BIC-16", "Road", "yellow", true);

        Bicycle b17 = new Bicycle("BIC-17", "Road", "red", true);

        Bicycle b18 = new Bicycle("BIC-18", "Mountain", "blue", true);

        Bicycle b19 = new Bicycle("BIC-19", "Road", "blue", true);

        Bicycle b20 = new Bicycle("BIC-20", "Mountain", "purple", true);

        Bicycle b21 = new Bicycle("BIC-21", "Road", "red", true);

        Bicycle b22 = new Bicycle("BIC-22", "Mountain", "yellow", true);

        Bicycle b23 = new Bicycle("BIC-23", "Mountain", "red", true);

        Bicycle b24 = new Bicycle("BIC-24", "Road", "green", true);

        Bicycle b25 = new Bicycle("BIC-25", "Road", "red", true);

        bicycles.add(b2);
        bicycles.add(b3);
        bicycles.add(b4);
        bicycles.add(b5);
        bicycles.add(b6);
        bicycles.add(b7);
        bicycles.add(b8);
        bicycles.add(b9);
        bicycles.add(b10);
        bicycles.add(b11);
        bicycles.add(b12);
        bicycles.add(b13);
        bicycles.add(b14);
        bicycles.add(b15);
        bicycles.add(b16);
        bicycles.add(b17);
        bicycles.add(b18);
        bicycles.add(b19);
        bicycles.add(b20);
        bicycles.add(b21);
        bicycles.add(b22);
        bicycles.add(b23);
        bicycles.add(b24);
        bicycles.add(b25);




        /*
        LocalDateTime _now = LocalDateTime.now();
        String __now = String.valueOf(_now);
        String now = __now.substring(11, 19);
        String date = "15:51:00";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long diff;
        try {
            Date dat = sdf.parse(date);
            Date date2 = sdf.parse(now);
            diff = dat.getTime() - date2.getTime();
            String hm = String.format("%02d:%02d", TimeUnit.MILLISECONDS.toHours(diff),
                    TimeUnit.MILLISECONDS.toMinutes(diff) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diff)));
            System.out.println(hm);

            int hr = (int) Math.floor((((int)diff)-60000)/1800000);
            System.out.println(hr);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(diff);

        String now2 = String.valueOf(LocalDateTime.now()).substring(0,10);
        System.out.println(now2);
        //diff/1800000 math.floor

         */
        //IO.writeBicycle(bicycles);
        //System.out.println(IO.readBicycles());

        //System.out.println(IO.readTickets());
        //System.out.println(IO.readUser());
        BiciU.mainMenu();
        //new ReturnBicycle().menu();
        //System.out.println(IO.readTickets());
        //new BorrowBicycle().menu();

    }
}
