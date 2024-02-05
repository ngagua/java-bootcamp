package dev.threads.memory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locking {
    static Lock lock = new ReentrantLock();
    static int count = 0;

    public static void test() {
        new Thread(() -> {
            int i = 0;
            while (i++ < 10_000) increment();
        }).start();
        new Thread(() -> {
            int i = 0;
            while (i++ < 10_000) increment();
        }).start();

        try {
            Thread.sleep(1000);
            System.out.println(count);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    private static void increment() {
//        lock.lock();
//        try {
//            count++;
//        } finally {
//            lock.unlock();
//        }
        increment_1();
        increment_2();
    }


    private static void increment_1() {
        lock.lock();
        count++;
    }

    private static void increment_2() {
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    private static void increment_synchronized() {
        increment_synchronized_1();
        increment_synchronized_2();
    }

    private synchronized static void increment_synchronized_1() {

        count++;
    }

    private static void increment_synchronized_2() {
        count++;
    }

}
