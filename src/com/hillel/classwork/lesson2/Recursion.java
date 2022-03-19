package com.hillel.classwork.lesson2;

public class Recursion {

    public static int COUNT = 0;
    public static int LIMIT = 10;

    public static void main(String[] args) {
        //recursionFunction();
        recursionFunction(10);
    }

    public static void recursionFunction() {
        System.out.println("Hello");
        COUNT++;

        if (COUNT <= LIMIT) {
            recursionFunction();
        }
    }

    public static void recursionFunction(int count) {

        System.out.println("Hello " + count);

        if (count <= 0) {
            return;
        }

        recursionFunction(count - 1);

    }

}
