package com.hillel.classwork.lesson3;

public class EqualCats {

    public static void main(String[] args) {

        Cat cat = new Cat("Vasiliy", 2);
        Cat cat1 = new Cat("Murka", 2);
        Cat cat2 = cat;
        Cat cat3 = new Cat("Test");
        Cat cat4 = new Cat(4);

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
        System.out.println(cat4);

        if (cat == cat2) {
            System.out.println(cat + " and " + cat2 + " equals by link");
        } else {
            System.out.println(cat + " and " + cat2 + " not equals by links");
        }

        if (cat.equals(cat1)) {
            System.out.println(cat + " and " + cat1 + " equals by values");
        } else {
            System.out.println(cat + " and " + cat1 + " not equals by values");
        }

    }


}
