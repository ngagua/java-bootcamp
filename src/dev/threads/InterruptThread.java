package dev.threads;

public class InterruptThread {
    public static void test() throws InterruptedException {
        StoppableThread stoppableThread = new StoppableThread();

        Thread thread1 = new Thread(stoppableThread, "one");
        thread1.setPriority(Thread.MAX_PRIORITY);

        thread1.start();


        Thread.sleep(496);
        stoppableThread.setStop(true);

        Thread.sleep(688);
        stoppableThread.setStop(false);
    }

    public static class StoppableThread implements Runnable {
        public boolean stop = false;

        public boolean isStop() {
            return stop;
        }

        public void setStop(boolean stop) {
            this.stop = stop;
        }

        @Override
        public void run() {
            while (!stop) {
                System.out.println("Thread is running...");
            }
            System.out.println("Thread is stopped)");
            Thread.currentThread().interrupt();
        }
    }
}
