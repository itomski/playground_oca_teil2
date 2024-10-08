package de.lubowiecki.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsTest {

    public static void main(String[] args) {

        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(10);

        Runnable aufgabe1 = () -> {
            for (int i = 0; i < 10_000; i++) {
                System.out.println(i + ": " + Thread.currentThread().getName());
            }
        };

        Runnable aufgabe2 = () -> {
            for (int i = 0; i < 10_000; i+=2) {
                System.out.println(i + ": " + Thread.currentThread().getName());
            }
        };

        service.execute(() -> countTo10000());
        service.execute(aufgabe1);
        service.execute(aufgabe2);
        service.execute(new Aufgabe(100));

        //new Thread(new Aufgabe(500)).start();

        new AndereAufgabe().start();

        //service.shutdown();
    }

    public static void countTo10000() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}

class Aufgabe implements Runnable {

    private int size;

    public Aufgabe(int size) {
        this.size = size;
    }

    @Override
    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}

class AndereAufgabe extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + getName());
        }
    }
}
