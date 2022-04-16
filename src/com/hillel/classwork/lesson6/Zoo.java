package com.hillel.classwork.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {

        Duck duck = new Duck("krya");
        tryToSwim(duck);
        Swimmable duck2 = new Duck("kria2");
        Swimmable ship = new Ship();
        Ship ship1 = new Ship();
        tryToSwim(ship1);

        List<Swimmable> swimmables = new ArrayList<>();
        swimmables.add(duck2);
        swimmables.add(ship);
        swimmables.add(duck);
        swimmables.add(ship1);

        for (Swimmable swimmable: swimmables) {
            swimmable.swim();
        }

    }

    public static void tryToSwim(Swimmable swimmable) {
        swimmable.swim();
    }
}
