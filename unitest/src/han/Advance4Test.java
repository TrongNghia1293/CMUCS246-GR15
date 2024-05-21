package han;
import org.junit.jupiter.api.Test;

import nguyen.Advance4;

import static org.junit.jupiter.api.Assertions.*;

public class Advance4Test {

    @Test
    void testIsPrimeNumberForNegativeInput() {
        Advance4 advance4 = new Advance4();
        boolean result = advance4.isPrimeNumber(-5);
        assertFalse(result);
    }

    @Test
    void testIsPrimeNumberForZero() {
        Advance4 advance4 = new Advance4();
        boolean result = advance4.isPrimeNumber(0);
        assertFalse(result);
    }

    @Test
    void testIsPrimeNumberForOne() {
        Advance4 advance4 = new Advance4();
        boolean result = advance4.isPrimeNumber(1);
        assertFalse(result);
    }

    @Test
    void testIsPrimeNumberForPrimeNumber() {
        Advance4 advance4 = new Advance4();
        boolean result = advance4.isPrimeNumber(17); // 17 is a prime number
        assertTrue(result);
    }

    @Test
    void testIsPrimeNumberForNonPrimeNumber() {
        Advance4 advance4 = new Advance4();
        boolean result = advance4.isPrimeNumber(15); // 15 is not a prime number
        assertFalse(result);
    }
}

