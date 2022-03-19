package com.hillel.classwork.lesson2;

public class ArrayMain {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < args.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

    }
}
