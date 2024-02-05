package dev.threads;

public class threadsToExecute {
    public static void test() {
        Thread thread = new threadsToExecute.SAublassOfThread();
        thread.start();

        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous runnable!");
            }
        };

        Runnable lambdaRunnable = () -> System.out.println("Hello from lambda runnable!");

        new Thread(anonymousRunnable).start();
        new Thread(lambdaRunnable).start();
        new Thread(new threadsToExecute.SAublassOfRunnable()).start(); //best option

    }

    public static class SAublassOfThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from thread!");
        }
    }

    public static class SAublassOfRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello from runnable!");
        }
    }
}
