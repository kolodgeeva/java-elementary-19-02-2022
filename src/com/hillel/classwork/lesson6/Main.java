package com.hillel.classwork.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        String selectAction = "select action: create, exit";
        System.out.println(selectAction);

        while (SCANNER.nextLine().equals("create")) {
            Item item = createItem();
            if (item != null) {
                items.add(item);
            }
            System.out.println(selectAction);
        }

        for (Item item: items) {
            if (item instanceof Flyable) {
                ((Flyable) item).fly();
            }
            if (item instanceof Swimmable) {
                ((Swimmable) item).swim();
            }
            if (item instanceof Runnable) {
                ((Runnable) item).run();
            }
        }
    }

    public static Item createItem() {
        System.out.println("select item: human, ship, duck");
        String input = SCANNER.nextLine();
        switch (input) {
            case "human":
                return new Human();
            case "ship":
                return new Ship();
            case "duck":
                return new Duck("test");
        }
        return null;
    }
}
