package han;

import org.junit.jupiter.api.Test;

import nguyen.Calculator3;

import static org.junit.jupiter.api.Assertions.*;

public class Calculator3Test {

    @Test
    public void testMulResult() {
        Calculator3 calculator = new Calculator3(5, 7);
        assertEquals(35, calculator.mul(), "Multiplication result should be 35");
    }

    @Test
    public void testMulWithMaxInt() {
        Calculator3 calculator = new Calculator3(Integer.MAX_VALUE, 2);
        // Asserting that the result is positive infinity due to integer overflow
        assertEquals(Integer.MAX_VALUE * 2, calculator.mul(), "Multiplication result should overflow");
    }

    @Test
    public void testMulWithMinInt() {
        Calculator3 calculator = new Calculator3(Integer.MIN_VALUE, 2);
        // Asserting that the result is negative infinity due to integer overflow
        assertEquals(Integer.MIN_VALUE * 2, calculator.mul(), "Multiplication result should overflow");
    }
}
