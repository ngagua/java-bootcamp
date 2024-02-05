package dev.threads.memory;

public class Volatile {
    public static volatile int counter = 0;

    public static void test() {
        Thread one = new Thread(() -> {
            int localCounter = counter;
            while (localCounter < 8) {
                if (localCounter != counter) {
                    System.out.printf("%s : %d\n", Thread.currentThread().getName(), localCounter);

                }
                localCounter = counter;

            }

        }, "one");

        Thread two = new Thread(() -> {
            int localCounter = counter;
            while (localCounter < 10) {
                counter = ++localCounter;
                System.out.printf("%s : %d\n", Thread.currentThread().getName(), localCounter);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }, "two");

        one.start();
        two.start();
    }
}
