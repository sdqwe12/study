package org.example;

public class Main {
    public static void main(String[] args) {

        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        };
        Runnable run2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }

        };

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();

       Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
    }
}