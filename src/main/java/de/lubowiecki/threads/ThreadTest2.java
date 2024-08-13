package de.lubowiecki.threads;

public class ThreadTest2 {

    public static void main(String[] args) {

        System.out.println("Start: " + Thread.currentThread().getName());

        // Runnable: void run()
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();
        new Thread(() -> countTo10000()).start();

        System.out.println("Ende: " + Thread.currentThread().getName());
    }

    public static void countTo10000() {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
        }
    }
}
