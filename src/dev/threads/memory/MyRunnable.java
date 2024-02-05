package dev.threads.memory;

import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable implements Runnable {
    private final Increment increment = new Increment();
    private final AtomicInteger count = new AtomicInteger(0);

    public void increment_1() {
        synchronized (increment) {
            count.incrementAndGet();
            increment.increment();
        }
    }


    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            increment_1();
        }
        System.out.printf("%s, %s, %s\n", Thread.currentThread().getName(), increment.getCount(), count.get());
    }
}
