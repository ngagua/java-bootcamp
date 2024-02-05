package dev.threads.memory;

public class TestMemory {
    public static void test() {
        MyRunnable myRunnable1 = new MyRunnable();
//        MyRunnable myRunnable2 = new MyRunnable(1);

        new Thread(myRunnable1, "first").start();
        new Thread(myRunnable1, "second").start();
    }
}
