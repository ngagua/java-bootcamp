package dev.threads.memory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {
    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    public static void test() {
        DeadLock deadLock = new DeadLock();
        new Thread(deadLock::one).start();
        new Thread(deadLock::two).start();
    }

    void lock1() {
        lock1.lock();
    }

    void unLock1() {
        lock1.unlock();
    }

    void one() {
        lock1();
        System.out.println("one");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("one after sleep");
        lock2();
        System.out.println("one after lock2");
        unLock1();
        unLock2();
    }

    void two() {
        lock2();
        System.out.println("two");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("two after sleep");
        lock1();
        System.out.println("two after lock1");
        unLock2();
        unLock1();
    }

    void lock2() {
        lock2.lock();
    }

    void unLock2() {
        lock2.unlock();
    }

}
