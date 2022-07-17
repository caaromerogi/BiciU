package com.sofka.utils.hourmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HourMeter {
    public static int difference(String startDate, String endDate) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long diff;
        int hr;
        try {
            Date dateFinish = sdf.parse(endDate);
            Date dateStart = sdf.parse(startDate);
            diff = dateFinish.getTime() - dateStart.getTime();
            String hm = String.format("%02d:%02d", TimeUnit.MILLISECONDS.toHours(diff),
                    TimeUnit.MILLISECONDS.toMinutes(diff) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(diff)));
            System.out.println(hm);

            hr = (int) Math.floor((((int) diff) - 60000) / 1800000);
            System.out.println(hr);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return hr;
    }
}
