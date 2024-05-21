package han;
import org.junit.Test;

import nguyen.Calculator4;

import static org.junit.Assert.assertEquals;

public class Calculator4Test {

    @Test
    public void testDivWithValidNumbers() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(10);
        calculator.setNumber2(2);
        int result = calculator.div();
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(10);
        calculator.setNumber2(0);
        calculator.div();
    }

    @Test
    public void testDivWithFloatResult() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(5);
        calculator.setNumber2(2);
        int result = calculator.div();
        assertEquals(2, result); 
    }
}
