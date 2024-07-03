package de.lubowiecki.uebung;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringArrayList {
    private Logger logger = Logger.getLogger("StringArrayList");
    private String[] elements = new String[10];
    private int size;

    {
        logger.setLevel(Level.ALL);
    }

    public void add(String element) {
        if(size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
            logger.info("Array vergrößert! Neue Größe: " + elements.length + ", Element: " + element);
        }
        elements[size++] = element;
    }

    public String get(int index) {
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
        sb.append(String.join(", ", Arrays.copyOf(elements, size)));
        sb.append("]");
        return sb.toString();
    }
}
