package com.hillel.classwork.lesson12;

import com.hillel.classwork.lesson11.FutureTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Multithreading {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<LocalDateTime>> futures = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            futures.add(executorService.submit(new FutureTest.CurrentDateTime()));
        }

        futures.get(3).cancel(true);

        executorService.shutdown();


        /*for (Future<LocalDateTime> future: futures) {
            System.out.println(future.get());
        }*/

    }

}
