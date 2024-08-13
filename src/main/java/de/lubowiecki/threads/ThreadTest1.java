package de.lubowiecki.threads;

public class ThreadTest1 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start: " + Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());

            Thread.sleep(1000);
        }

        System.out.println("Ende: " + Thread.currentThread().getName());
    }
}
