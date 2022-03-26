package com.hillel.classwork.lesson3;

public class Primitives {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("before method " + number);

        changeNumber(number);

        System.out.println("after method " + number);

    }

    public static void changeNumber(int n) {

        System.out.println("got number " + n);

        n = 20;

        System.out.println("after change " + n);

    }

}
