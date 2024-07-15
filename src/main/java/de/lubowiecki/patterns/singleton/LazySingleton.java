package de.lubowiecki.patterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private int zahl;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        // TODO: Ist nicht Threadsave
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
