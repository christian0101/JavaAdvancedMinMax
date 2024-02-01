package advancedminmax;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MinMaxTest {

    @Test
    void testInvalidInputMin() {
        assertThrows(UnsupportedOperationException.class, MinMax::min);
    }

    @Test
    void testInvalidInputMax() {
        assertThrows(UnsupportedOperationException.class, MinMax::max);
    }

    @Test
    void testMinInt() {
        Integer result = MinMax.min(1, 2, 3);
        assertEquals(1, result);
    }

    @Test
    void testMaxInt() {
        Integer result = MinMax.max(1, 2, 3);
        assertEquals(3, result);
    }

    @Test
    void testMinDouble() {
        Double result = MinMax.min(1.2, -3.9, 4.0);
        assertEquals(-3.9, result);
    }

    @Test
    void testMaxDouble() {
        Double result = MinMax.max(1.2, -3.9, 4.0);
        assertEquals(4.0, result);
    }

    @Test
    void testMinLong() {
        Long result = MinMax.min(1L, 2L, 3L);
        assertEquals(1L, result);
    }

    @Test
    void testMaxLong() {
        Long result = MinMax.max(1L, 2L, 3L);
        assertEquals(3L, result);
    }

    @Test
    void testMinBigDecimal() {
        BigDecimal result = MinMax.min(BigDecimal.valueOf(1.2), BigDecimal.valueOf(-3.9),
                BigDecimal.valueOf(4.0));
        assertEquals(BigDecimal.valueOf(-3.9), result);
    }

    @Test
    void testMaxBigDecimal() {
        BigDecimal result = MinMax.max(BigDecimal.valueOf(1.2), BigDecimal.valueOf(-3.9),
                BigDecimal.valueOf(4.0));
        assertEquals(BigDecimal.valueOf(4.0), result);
    }
}
