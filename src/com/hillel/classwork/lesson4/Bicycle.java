package com.hillel.classwork.lesson4;

public class Bicycle {

    private int weight;
    private String model;

    public Bicycle(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public void ride() {
        System.out.println("Bicycle " + model + " is riding now");
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    public class SteeringWheel {

        public void left() {
            System.out.println("Bicycle " + model + " is turning left");
        }

        public void right() {
            System.out.println("Bicycle " + model + " is turning right");

        }

    }

}
