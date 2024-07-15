package de.lubowiecki.patterns.singleton;

public enum EnumSingleton {

    INSTANCE;

    private int zahl;

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
