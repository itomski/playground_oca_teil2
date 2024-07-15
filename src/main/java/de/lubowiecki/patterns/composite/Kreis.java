package de.lubowiecki.patterns.composite;

public class Kreis extends AbstractGeometrischeForm {

    private int radius;

    public Kreis() {
    }

    public Kreis(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
