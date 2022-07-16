package com.sofka.utils.hourmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HourMeter {
    public static void difference(String startDate, String endDate){
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

        } catch (
                ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(diff);
    }
}
