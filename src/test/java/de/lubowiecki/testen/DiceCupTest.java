package de.lubowiecki.testen;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DiceCupTest {

    @Nested
    class RepeatedTests {
        @RepeatedTest(value = 10, name = "Versuch {currentRepetition} von {totalRepetitions}")
        void zufallsZahlenW6() {
            DiceCup cup = new DiceCup();
            int rand = cup.roll();
            assertTrue(rand > 0 && rand <= 6);
        }
    }

    @Nested
    class ParametrisierteTests {

        @ParameterizedTest
        @ValueSource(ints = {6, 10, 20, 100})
        //@Disabled
        void zufallsZahlenMitVerschiedenenWuerfeln(int size) {
            DiceCup cup = new DiceCup(size);
            int rand = cup.roll();
            assertTrue(rand > 0 && rand <= size);
        }
    }
}