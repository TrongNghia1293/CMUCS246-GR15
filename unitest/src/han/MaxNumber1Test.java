package han;

import org.junit.Test;

import nguyen.MaxNumber1;

import static org.junit.Assert.assertEquals;

public class MaxNumber1Test {

    @Test
    public void testMax3FirstIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1(5, 3, 1);
        int result = maxNumber.max3();
        assertEquals(5, result);
    }

    @Test
    public void testMax3SecondIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1(3, 5, 1);
        int result = maxNumber.max3();
        assertEquals(5, result);
    }

    @Test
    public void testMax3ThirdIsMax() {
        MaxNumber1 maxNumber = new MaxNumber1(1, 3, 5);
        int result = maxNumber.max3();
        assertEquals(5, result);
    }
}

