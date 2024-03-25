package org.example;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Runnable task1 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.incre();
            }
        };
        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                count.decre();
            }
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join(); //t1쓰레드가 종료되는걸 기다리겠다
        t2.join(); 

        //t1t2다 종료되면 출력
        System.out.println(count.getCnt());
    }
}
