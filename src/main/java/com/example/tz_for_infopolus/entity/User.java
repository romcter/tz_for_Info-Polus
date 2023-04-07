package com.example.tz_for_infopolus.entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;

    private List<Car> cars = new ArrayList();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public User(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", cars=" + cars +
                '}';
    }
}
