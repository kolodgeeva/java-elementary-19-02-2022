package com.hillel.classwork.lesson3;

public class Links {


    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.age = 10;

        System.out.println("before method " + cat.age);

        changeCat(cat);

        System.out.println("after method " + cat.age);

    }


    public static void changeCat(Cat cat) {

        System.out.println("before change " + cat.age);

        cat.age = 20;

        System.out.println("after change " + cat.age);

    }

}
