package com.hillel.classwork.lesson5;

public class Orange extends Plant {

    private int age;

    public Orange(int age) {
        super(300, "Rutaceae");
        this.age = age;
        System.out.println("create orange");
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "age=" + age +
                ", height=" + height +
                ", family='" + family + '\'' +
                '}';
    }

    // метод переопределен, вызывает родительский метод и имеет свою логику, то есть расширяет родительскую
    // имплементацию
    @Override
    public void photosynthesis() {
        super.photosynthesis();
        age++;
        System.out.println("orange age " + age);
    }
}