package com.example.tz_for_infopolus.entity;

public class Car {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", name='" + name + '\'' +
                '}';
    }
}
