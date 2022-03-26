package com.hillel.classwork.lesson2;

import java.util.Scanner;

public class DogMain {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();
        dog.breed = "Chow chow";

        System.out.println(dog.breed);

        dog.eat();



    }


}
