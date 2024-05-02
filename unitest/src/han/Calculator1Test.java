package han;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import nguyen.Calculator1;



public class Calculator1Test {

    Calculator1 calculator = new Calculator1();

    @Test
    public void testAddTwoPositiveIntegers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAddTwoNegativeIntegers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testAddPositiveAndNegativeIntegers() {
        assertEquals(2, calculator.add(5, -3));
    }

    @Test
    public void testAddOverflow() {
        // This test case demonstrates overflow behavior, but Java does not throw exceptions for overflow.
        // It wraps around due to the limitations of 32-bit signed integers.
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testAddUnderflow() {
        // Similarly, underflow wraps around, so the test checks expected wraparound behavior.
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));
    }

}