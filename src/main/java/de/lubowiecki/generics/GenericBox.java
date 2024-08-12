package de.lubowiecki.generics;

public class GenericBox<T> { // Platzhalter wird definiert

    private T content; // Verwendung des generischen Typs als Variablen-Typ

    public GenericBox() {
    }

    public GenericBox(T content) { // Verwendung des generischen Typs als Parameter-Typ
        this.content = content;
    }

    public T getContent() { // Verwendung des generischen Typs als Rückgabe-Typ
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public String getContentAsString() { // Nicht generische Methode
        return content.toString();
    }
}
