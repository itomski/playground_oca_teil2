package de.lubowiecki.testen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrzeugMangementTest {

    private FahrzeugMangement mangement;

    @BeforeEach
    public void setup() {
        mangement = new FahrzeugMangement();
    }

    @Test
    void fahrzeugHinzufuegen() {
        mangement.addFahrzeuge(new Fahrzeug("AB:CD123", 2012));
        assertFalse(mangement.getFahrzeuge().isEmpty());
        assertEquals(1, mangement.getFahrzeuge().size());
    }

    @Test
    void nullHinzufuegen() {
        assertThrows(IllegalArgumentException.class, () -> {
            mangement.addFahrzeuge(null);
        });
    }
}