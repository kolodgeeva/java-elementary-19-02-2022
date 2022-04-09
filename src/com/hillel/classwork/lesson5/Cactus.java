package com.hillel.classwork.lesson5;

public class Cactus extends Plant {

    public Cactus(int height) {
        super(height, "Cactaceae");
        System.out.println("create cactus");
    }

    // метод photosynthesis не переопределен, значит будет вызван родительский метод

}
