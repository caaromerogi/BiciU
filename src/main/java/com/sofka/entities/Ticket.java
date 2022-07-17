package com.sofka.entities;

import com.sofka.entities.abstractclasses.User;

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

    public Ticket(int position, Bicycle bicycle, User user, String date, String startTime) {
        setId(position+1);
        this.bicycle = bicycle;
        this.user = user;
        this.date = date;
        this.startTime = startTime;
        this.endTime = "-";
        this.haveHelmet = true;
        this.isInGoodCondition = true;
        this.status = "active";
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


    public void setId(int id) {
        this.id = "T-"+ String.format("%03d", id);
    }

    public void setDelay(int delays){
        amount += delays*3;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setHaveHelmet(boolean haveHelmet) {
        if (!haveHelmet) {
            amount += 5;
        }

        this.haveHelmet = haveHelmet;
    }

    public void setInGoodCondition(boolean inGoodCondition) {
        if(!inGoodCondition){
            amount += 5;
        }

        isInGoodCondition = inGoodCondition;
    }

    public void confirmStatus(){
        if (amount!=0){
            setStatus("pending");
        }else {
            setStatus("OK");
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public User getUser() {
        return user;
    }

    public String getId() {
        return id;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public boolean isHaveHelmet() {
        return haveHelmet;
    }

    public boolean isInGoodCondition() {
        return isInGoodCondition;
    }

    public String getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }


}
