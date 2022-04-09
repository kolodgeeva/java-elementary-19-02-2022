package com.hillel.classwork.lesson5;

public class Dandelion extends Plant {

    public Dandelion(int height) {
        super(height, "Asteraceae");
        System.out.println("create dandelion");
    }

    // так как метод переопределен в дочернем классе, то будет вызван он, а не родительский метод
    @Override
    public void photosynthesis() {
        System.out.println("dandelion photosynthesis: " + this.height);
    }

    public void bloom() {
        System.out.println("Dandelion is blooming now!");
    }

}
