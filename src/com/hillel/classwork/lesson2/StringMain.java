package com.hillel.classwork.lesson2;

import java.util.Scanner;

public class StringMain {

    public static void main(String[] args) {


        String str = "hello";
        System.out.println(str.hashCode());
        System.out.println(str);

        String str2 = "hello2";
        System.out.println(str2.hashCode());
        System.out.println(str2);


        str = str2 + str;
        System.out.println(str + str2);


        /*StringBuilder builder = new StringBuilder("1")
            .append(2)
            .append(true)
            .append("test");*/


        String s = getString();

        System.out.println(s);

    }

    private static String getString() {
        StringBuilder builder = new StringBuilder("1");

        builder.append(2);
        builder.append(true);
        builder.append("test");

        for (int i = 0; i < 100; i++) {
            builder.append(i);
        }

        return builder.toString();
    }

}
