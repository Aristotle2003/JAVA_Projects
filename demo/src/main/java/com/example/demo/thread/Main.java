package com.example.demo.thread;

public class Main {

    private static int counter = 0;

    // 1. read counter (R)
    // 2. add counter by 1 (A)
    // 3. write counter (W)

    // 2R = 0
    // 2A = -1
    // 1R = 0
    // 1A = 1
    // 1W = 1
    // 2W = -1

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());


        Runnable job1 = () -> {
            System.out.println(Thread.currentThread());
            for (int i = 0; i < 1000; i++) {
                synchronized (Main.class) {
                    counter += 1;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable job2 = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (Main.class) {
                    counter -= 1;
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(job1);
//        Thread t2 = new Thread(job2);

//        t1.run();
//        t2.start();
//
        t1.start();
        t1.join();
//        t2.join();
//        Thread.sleep(100);
        System.out.println(counter);
    }
}
