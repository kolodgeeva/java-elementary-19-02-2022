package com.hillel.classwork.lesson2;

public class Overloading {


    public static void main(String[] args) {


        /*

        написать 2 перегруженых метода для суммирования чисел
        1 - для суммирования 2 интов
        2 - для суммирования 3 лонгов


         */

        int result = sum(2, 3);
        System.out.println(result);

        System.out.println(sum(2, 2));

        System.out.println(sum(2L, 5L, 7L));

    }

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static long sum(long n1, long n2, long n3) {
        return n1 + n2 + n3;
    }

}
