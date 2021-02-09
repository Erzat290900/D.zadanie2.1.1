package com.company;

public class Animal {
    private int age;
    private double weight;
    private Color color;
    private Car car;


    public Animal(int age, Color color, double weight, Car car) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.car = car;
    }


    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }

    public Car getCar() {
        return car;
    }

    public String info() {
        return "\nAge = " + age + "\nweight = " + weight + "\nColor = " + color + "\nCar = " + car;
    }
}
