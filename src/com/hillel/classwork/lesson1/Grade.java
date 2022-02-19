package com.hillel.classwork.lesson1;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input your average grade:");

        int grade = scanner.nextInt();

        /*
        1-3 - двоечние
        4-6 - троечник
        7-9 - хорошист
        10-12 - отличник
         */

        if (grade >= 1 && grade <= 3) {
            System.out.println("двоечние");
        } else if (grade >= 4 && grade <= 6) {
            System.out.println("троечник");
        } else if (grade >= 7 && grade <= 9) {
            System.out.println("хорошист");
        } else if (grade >= 10 && grade <= 12) {
            System.out.println("отличник");
        } else {
            System.out.println("invalid grade");
        }
    }

}
