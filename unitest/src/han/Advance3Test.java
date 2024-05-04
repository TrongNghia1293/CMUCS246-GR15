package han;
import org.junit.jupiter.api.Test;

import nguyen.Advance3;

import static org.junit.jupiter.api.Assertions.*;

public class Advance3Test {

    @Test
    void testFibonacciForNegativeInput() {
        Advance3 advance3 = new Advance3();
        int result = advance3.fibonacci(-5);
        assertEquals(-1, result);
    }

    @Test
    void testFibonacciForZero() {
        Advance3 advance3 = new Advance3();
        int result = advance3.fibonacci(0);
        assertEquals(0, result);
    }

    @Test
    void testFibonacciForOne() {
        Advance3 advance3 = new Advance3();
        int result = advance3.fibonacci(1);
        assertEquals(1, result);
    }

    @Test
    void testFibonacciForLargeNumber() {
        Advance3 advance3 = new Advance3();
        int result = advance3.fibonacci(10); // Fibonacci number at index 10 is 55
        assertEquals(55, result);
    }
}
