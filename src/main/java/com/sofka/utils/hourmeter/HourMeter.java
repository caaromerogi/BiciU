package com.sofka.utils.hourmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourMeter {
    public static int difference(String startDate, String endDate) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        long diff;
        int hr;
        try {
            Date dateFinish = sdf.parse(endDate);
            Date dateStart = sdf.parse(startDate);
            diff = dateFinish.getTime() - dateStart.getTime();

            hr = (int) Math.floor((((int) diff) - 60000) / 1800000);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return hr;
    }
}
