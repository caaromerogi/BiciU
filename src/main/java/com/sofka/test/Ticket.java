package com.sofka.test;

import java.io.Serializable;

public class Ticket implements Serializable {
    private String id;
    private Bicycle bicycle;
    private User user;
    private String date;
    private String startTime;
    private String endTime;
    private boolean haveHelmet;
    private boolean isInGoodCondition;
    private String status;
    private int amount;

    public Ticket(Bicycle bicycle, User user, String date, String startTime, String endTime, boolean haveHelmet, boolean isInGoodCondition, String status, int amount) {
        this.bicycle = bicycle;
        this.user = user;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.haveHelmet = haveHelmet;
        this.isInGoodCondition = isInGoodCondition;
        this.status = status;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", bicycle=" + bicycle +
                ", user=" + user +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", haveHelmet=" + haveHelmet +
                ", isInGoodCondition=" + isInGoodCondition +
                ", status='" + status + '\'' +
                ", amount=" + amount +
                '}';
    }

    public User getUser() {
        return user;
    }
}
