package com.hillel.classwork.lesson3;

import java.util.Objects;

public class Cat {

    String name;
    int age;

    public Cat() {
        System.out.println("create cat");
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(int age) {
        this.age = age;
        this.name = "Unknown";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return this.age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public String toString() {
        return "Cat: " + this.name + ", " + this.age;
    }

}
