package de.lubowiecki;

public class Zoo {

    public static void main(String[] args) throws Exception {

        Animal a = new Dog(); // Dog IS-A Animal
        a.sagHallo();

        a = new Cat(); // Cat IS-A Animal
        a.sagHallo();

        // Cat c = new Dog(); // sind Geschwister-Elemente

        //double[] arr1 = new int[]{1,2,3};
        Object arr2 = new int[]{1,2,3};


    }
}

abstract class Animal {

    public abstract void sagHallo() throws Exception;
}

class Dog extends Animal {
    @Override
    public void sagHallo() {
        System.out.println("Wau Wau!");
    }
}

class Cat extends Animal {
    @Override
    public void sagHallo() {
        System.out.println("Miau Miau!");
    }
}