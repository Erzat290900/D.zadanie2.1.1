package com.company;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    public String getName() {
        return model;
    }


    public int getYear() {
        return year;
    }

    public String info1() {
        return "\nmodel =" + model + "\nyear = " + year;
    }

}
