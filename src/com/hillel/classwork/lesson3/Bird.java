package com.hillel.classwork.lesson3;

public class Bird {

    static int COUNT = 0;

    private String color;

    public Bird(String color) {
        this.color = color;
        COUNT++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speak() {
        System.out.println("Чик-чирик!");
    }

    @Override
    public String toString() {
        return "Bird: color = " + color;
    }

    public static int getCount() {
        return COUNT;
    }

}
