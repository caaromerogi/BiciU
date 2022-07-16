package com.sofka.entities;

import com.sofka.abstractclasses.User;

import java.io.Serializable;

public class Ticket implements Serializable{
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

    public Ticket(String id, Bicycle bicycle, User user, String date, String startTime) {
        this.id = id;
        this.bicycle = bicycle;
        this.user = user;
        this.date = date;
        this.startTime = startTime;
        this.endTime = "-";
        this.haveHelmet = true;
        this.isInGoodCondition = true;
        this.status = "pending";
        this.amount = 0;
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
