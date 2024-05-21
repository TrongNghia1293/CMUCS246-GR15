package han;

import org.junit.Test;

import nguyen.MaxNumber2;

import static org.junit.Assert.assertEquals;

public class MaxNumber2Test {

    @Test
    public void testMax2FirstIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2();
        maxNumber.number1 = 5;
        maxNumber.number2 = 3;
        int result = maxNumber.max2();
        assertEquals(5, result);
    }

    @Test
    public void testMax2SecondIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2();
        maxNumber.number1 = 3;
        maxNumber.number2 = 5;
        int result = maxNumber.max2();
        assertEquals(5, result);
    }
}
