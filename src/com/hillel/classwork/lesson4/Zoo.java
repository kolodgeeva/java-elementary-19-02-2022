package com.hillel.classwork.lesson4;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Animal cat = new Cat();
        setAnimalName(cat,"Kuzia");
        System.out.println(cat.name);

        Animal dog = new Dog();
        setAnimalName(dog, "Bobik");
        System.out.println(dog.name);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        for (Animal animal: animals) {
            animal.speak();
        }

    }


    public static void setAnimalName(Animal animal, String name) {
        animal.name = name;
    }
}
