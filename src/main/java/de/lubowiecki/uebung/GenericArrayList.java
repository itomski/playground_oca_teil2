package de.lubowiecki.uebung;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericArrayList<T> {
    private Logger logger = Logger.getLogger("ArrayList");
    private T[] elements;
    private int size;

    {
        logger.setLevel(Level.ALL);
    }

    public GenericArrayList() {
        this.elements = (T[]) new Object[10];
    }

    public void add(T element) {
        if(size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
            logger.info("Array vergrößert! Neue Größe: " + elements.length + ", Element: " + element);
        }
        elements[size++] = element;
    }

    public T get(int index) {
        try {
            return elements[index];
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            logger.warning("Array Index nicht verfügbar!");
            return null;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        // TODO: Auf Generics umstellen
        //sb.append(String.join(", ", Arrays.copyOf(elements, size)));
        sb.append("]");
        return sb.toString();
    }
}