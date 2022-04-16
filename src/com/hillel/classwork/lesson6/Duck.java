package com.hillel.classwork.lesson6;

public class Duck extends Item implements Swimmable, Flyable, Runnable {

    private final String name;

    public Duck(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies");
    }

    @Override
    public void run() {
        System.out.println("Duck runs");
    }
}
