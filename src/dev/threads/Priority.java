package dev.threads;

public class Priority {
    public static void test() {
        Thread thread = new Thread(() -> {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("name: %s, id: %d, priority: %d, time: %d \n",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getId(),
                    Thread.currentThread().getPriority(),
                    System.currentTimeMillis() - currentTimeMillis);

        }, "one");
        thread.setPriority(Thread.MAX_PRIORITY);
        Thread thread1 = new Thread(() -> {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("name: %s, id: %d, priority: %d, time: %d \n",
                    Thread.currentThread().getName(),
                    Thread.currentThread().getId(),
                    Thread.currentThread().getPriority(),
                    System.currentTimeMillis() - currentTimeMillis);

        }, "two");
        thread.setPriority(Thread.MIN_PRIORITY);

        thread.start();
        thread1.start();
    }
}
