package com.hillel.classwork.lesson13;

public class TwoInterfaces {

    public static void main(String[] args) {
        AB ab = new AB();
        ab.foo();
    }

    public static class AB implements A, B {
        @Override
        public void foo() {
            B.super.foo();
            A.super.foo();
        }

    }


    public interface A {
        default void foo() {
            System.out.println("A foo");
        }
    }

    public interface B {
        default void foo() {
            System.out.println("B foo");
        }
    }

}
