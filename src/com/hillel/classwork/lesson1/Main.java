package com.hillel.classwork.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input number:");

        int numberVariable = scanner.nextInt();

        if (numberVariable % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("не четное");
        }

        // если число четное, вывести в консоль сообщение - число четное
        // иначе вывести в консоль сообщение - число не четное

    }
}
