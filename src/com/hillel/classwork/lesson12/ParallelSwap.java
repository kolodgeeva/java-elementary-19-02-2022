package com.hillel.classwork.lesson12;

import java.util.ArrayList;
import java.util.List;

public class ParallelSwap {

    public static Swapper SWAPPER = new Swapper();

    public static void main(String[] args) throws InterruptedException {

        SwapperTask swapperTask = new SwapperTask();
        ExceptionHandler eh = new ExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(eh);

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(swapperTask);
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println(SWAPPER.name1);
        System.out.println(SWAPPER.name2);

    }

    public static class ExceptionHandler implements Thread.UncaughtExceptionHandler {

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Thread " + t.getName() + " throws exception " + e.getMessage());
        }
    }

    public static class SwapperTask implements Runnable {

        @Override
        public void run() {
            SWAPPER.swap();

            throw new IllegalStateException("Hello from runnable!");
        }
    }

    public static class Swapper {

        volatile String name1 = "Оля";
        volatile String name2 = "Лена";

        public void swap() {

            // code

            synchronized (this) {
                String temp = name1;



                name1 = name2;
                name2 = temp;

            }

            // code
        }
    }
}
