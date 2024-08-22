package de.lubowiecki.testen;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {

    private Taschenrechner rechner;

    @BeforeAll
    public static void setupAll() {
        System.out.println("Wird 1x vor allen Test ausgeführt");
    }

    @BeforeEach
    public void setupEach() {
        rechner = new Taschenrechner();
    }

    @AfterEach
    public void tearDownEach() {
        System.out.println("Wird nach jedem Test 1x ausgeführt");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("Wird 1x nach allen Test ausgeführt");
    }

    @Test
    @DisplayName("2 plus 2 = 4")
    void zweiAddZweiErgibtVier() {
        assertEquals(4, rechner.add(2, 2));
    }

    @Test
    @DisplayName("2 plus 3 = 5")
    //@EnabledOnOs(value = OS.WINDOWS, disabledReason = "Verwendet Absolute UNIX-Pfade")
    void zweiAddDreiErgibtFuenf() {
        assertEquals(5, rechner.add(2, 3));
    }

    @Test
    @DisplayName("4 minus 3 = 1")
    void vierSubDreiErgibtEins() {
        assertEquals(1, rechner.sub(4, 3));
    }

    @Test
    @DisplayName("10 minus 3 = 7")
    void ZehnSubDreiErgibtSieben() {
        assertEquals(7, rechner.sub(10, 3));
    }
}