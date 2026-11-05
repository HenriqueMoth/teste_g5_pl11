package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathKit678Test {

    @Test
    void positiveWorks() {
        assertTrue(MathKit678.positive(3));
        assertFalse(MathKit678.positive(-3));
        assertFalse(MathKit678.positive(0));
    }

    @Test
    void midpointWorks() {
        assertEquals(5.0, MathKit678.midpoint(4.0, 6.0), 1e-9);
        assertEquals(0.0, MathKit678.midpoint(-1.0, 1.0), 1e-9);
    }

    @Test
    void surfaceWorks() {
        assertEquals(12, MathKit678.surface(3, 4));
        assertEquals(35, MathKit678.surface(5, 7));
    }
    @Test 
    void biggestWorks() {
        assertEquals(5, MathKit678.biggest(1, 5));
        assertEquals(18, MathKit678.biggest(17, 18));
        assertEquals(0, MathKit678.biggest(0, -1));
        assertEquals(100, MathKit678.biggest(100, -125));
    }
    @Test 
    void convertTempWorks() {
       assertEquals(68, MathKit678.convertTemp(20));
       assertEquals(0, MathKit678.convertTemp(32));
    }
}
