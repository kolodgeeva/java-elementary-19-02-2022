package com.hillel.classwork.lesson6;

import java.util.Scanner;

public class SayHi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Greeting greeting = createGreeting(input);
        greeting.hi();

    }

    public static Greeting createGreeting(String input) {
        if (input.equals("kind")) {
            return new KindGreeting();
        }
        return new AngryGreeting();
    }


}
