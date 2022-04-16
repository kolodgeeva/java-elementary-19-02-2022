package com.hillel.classwork.lesson6;

public class Human extends Item implements Runnable, Swimmable{
    @Override
    public void run() {
        System.out.println("Human runs");
    }

    @Override
    public void swim() {
        System.out.println("Human swims");
    }
}
