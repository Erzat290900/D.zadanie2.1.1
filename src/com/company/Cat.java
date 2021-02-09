package com.company;

public class Cat extends Animal {
    private String name;


    public Cat(int age, double weight, Color color, Car car, String name) {
        super(age, color, weight, car);
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void move(double distance, int time) {
        System.out.println("time " + time + " moved " + distance + " km ");

    }

    public final void move(int time, double distance) {
        System.out.println("time " + time + " moved " + distance + " km ");
    }

    public String info() {
        return "\nName " + name + "\ncolor " + getColor();
    }
}
