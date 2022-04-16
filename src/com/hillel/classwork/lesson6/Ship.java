package com.hillel.classwork.lesson6;

public class Ship extends Item implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Ship swims");
    }
}
