package com.core.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 ExecutorService example
 */
public class Test_Executor_Service {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = () -> System.out.println("task 1 is runnning");

        Runnable task2 = () -> System.out.println("task 2 is runnning");

        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
    }
}
