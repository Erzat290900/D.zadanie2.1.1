package com.company;

public final class Reptily extends Cat {
    private String typeReptily;


    public Reptily(int age, double weight, Color color, Car car, String typeReptily, String name) {
        super(age, weight, color, car, name);
        this.typeReptily = typeReptily;
    }


    public String getTypeReptily() {
        return typeReptily;
    }

    public void move(double distance, int time) {
        System.out.println("time " + time + " moved " + distance + " km ");
    }

    public String info() {
        return "\nтип рептилии = " + typeReptily + "\ncolor " + getColor();

    }
}
