package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(2, Color.BLACK, 4, new Car(" mers ", 2000));
        Car car = animal.getCar();
        System.out.println(animal.info() + "---" + car.info1());


        final Cat cat = new Cat(3, 4, Color.GREEN, animal.getCar(), "Мышык");
        Car car1 = animal.getCar();
        System.out.println(cat.info() + car1.info1());
        cat.move(12.2, 4);
        cat.move(5, 10.4);
        System.out.println("---------------");

        Reptily reptily = new Reptily(10, 20.3, Color.WHITE, animal.getCar(), "Frog ",
                "додо");
        Car car2 = animal.getCar();
        System.out.println(reptily.info() + car2.info1());
        reptily.move(2.4, 5);


        Reptily reptily1 = new Reptily(7, 10, Color.RED, animal.getCar(), "snake",
                "anakonda");
        Car car3 = animal.getCar();
        System.out.println(reptily1.info() + car3.info1());
        reptily.move(14.5, 6);


    }

}
