package com.hillel.classwork.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Laboratory {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        List<Plant> plants = new ArrayList<>();

        String actionMessage = "choose action: 1. create, 2. press any key for exist";
        System.out.println(actionMessage);

        String input = SCANNER.nextLine();
        while ("create" .equals(input.toLowerCase(Locale.ROOT).trim())) {
            Plant plant = createPlant();
            if (plant != null) {
                plants.add(plant);
            }
            System.out.println(actionMessage);
            input = SCANNER.nextLine();
        }

        for (Plant plant : plants) {
            plant.photosynthesis();

            if (plant instanceof Dandelion) {
                Dandelion dandelion = (Dandelion) plant;
                dandelion.bloom();
            }

        }

    }

    public static Plant createPlant() {
        System.out.println("input plant type: orange, cactus, dandelion");
        String plantType = SCANNER.nextLine();
        switch (plantType.toLowerCase(Locale.ROOT).trim()) {
            case "orange":
                System.out.println("input orange age:");
                int age = Integer.parseInt(SCANNER.nextLine());
                return new Orange(age);
            case "cactus":
                System.out.println("input cactus height:");
                int height = Integer.parseInt(SCANNER.nextLine());
                return new Cactus(height);
            case "dandelion":
                System.out.println("input dandelion height:");
                int height2 = Integer.parseInt(SCANNER.nextLine());
                return new Dandelion(height2);
        }
        System.out.println("Incorrect plant type " + plantType + ". Try Again");
        return null;
    }

}
