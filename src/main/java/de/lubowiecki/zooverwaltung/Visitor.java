package de.lubowiecki.zooverwaltung;

public abstract class Visitor {

    private double price;
    private int number;

    public Visitor(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }
}
