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
        return "Bicycle{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
