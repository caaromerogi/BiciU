package com.sofka.entities;

import java.io.Serializable;

public class Bicycle implements Serializable {
    private String id;
    private String type;
    private String color;
    private boolean isAvailable;

    public Bicycle(String id, String type, String color, boolean isAvailable) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.isAvailable = isAvailable;
    }



    @Override
    public String toString() {
        return "Code ='" + id + '\n' +
                ", Type='" + type + '\n' +
                ", Color='" + color + '\n';
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
