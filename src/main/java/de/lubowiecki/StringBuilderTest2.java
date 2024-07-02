package de.lubowiecki;

import java.util.Objects;

public class StringBuilderTest2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hallo ");
        sb1.append("Welt");

        StringBuilder sb2 = sb1;

        System.out.println(sb1 == sb2); // Das gleiche Objekt auf dem Heap?
        System.out.println(sb1.equals(sb2)); // Hat es den gleichen Inhalt?

        System.out.println();

        StringBuilder sb3 = new StringBuilder("Hallo Welt");
        System.out.println(sb1 == sb3); // Das gleiche Objekt auf dem Heap?
        System.out.println(sb1.equals(sb3)); // equals von Object wird benutzt
        System.out.println(sb1.toString().equals(sb3.toString())); // equals von String wird benutzt

        System.out.println();

        Buch b1 = new Buch("Idoru");
        Buch b2 = new Buch("Der 100-Jährige der aus dem Fenster stieg und verschwand");
        Buch b3 = new Buch("Idoru");

        System.out.println(b1 == b3);
        System.out.println(b1.equals(b3));

        System.out.println();

        StringBuilder sb4 = new StringBuilder("Moin"); // capacity = 4 + 16 -> 20
        sb4.append("1234567890");
        System.out.println("cap: " + sb4.capacity());
        System.out.println("zeichen: " + sb4.length());
        sb4.append("1234567890");
        System.out.println("cap: " + sb4.capacity()); // Alte cap * 2 + 2
        System.out.println("zeichen: " + sb4.length());
        sb4.append("1234567890");
        sb4.append("1234567890");
        System.out.println("cap: " + sb4.capacity()); // Alte cap * 2 + 2
        System.out.println("zeichen: " + sb4.length());

        System.out.println();

        sb4 = new StringBuilder("Moin"); // capacity = 4 + 16 -> 20
        sb4.ensureCapacity(30); // sichert, dass eine bestimmte Anzahl von Zeichen ohne Vergrößerung reinpasst
        System.out.println("cap: " + sb4.capacity()); // Alte cap * 2 + 2
        System.out.println("zeichen: " + sb4.length());
        sb4.ensureCapacity(100); // Capacity wird optimiert
        System.out.println("cap: " + sb4.capacity()); // 100
        System.out.println("zeichen: " + sb4.length());
    }
}

class Buch {

    private String titel;

    public Buch(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    // Die von Object geerbte equals-Methode muss überschrieben werden, damit ein Inhaltsvergleich möglich ist
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buch buch = (Buch) o;
        return Objects.equals(titel, buch.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel);
    }
}
