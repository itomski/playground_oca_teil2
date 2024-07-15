package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementGroup implements MovableElement {

    private List<MovableElement> elements;

    public ElementGroup() {
        this.elements = new ArrayList<>();
    }

    public ElementGroup(MovableElement... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(MovableElement element) {
        this.elements.add(element);
    }

    public void add(MovableElement... elements) {
        this.elements.addAll(Arrays.asList(elements));
    }

    public void remove(MovableElement element) {
        this.elements.remove(element);
    }

    public void remove(MovableElement... elements) {
        this.elements.removeAll(Arrays.asList(elements));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ElementGroup{");
        sb.append("elements=").append(elements);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public void move(int x, int y) {
        for(MovableElement e : elements) {
            e.move(x, y); // x und y wird an alle Elemente delegiert
        }
    }
}
