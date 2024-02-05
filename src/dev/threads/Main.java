package dev.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.execute(() -> System.out.println(Thread.currentThread().getName()));
        System.out.println();
    }

}
