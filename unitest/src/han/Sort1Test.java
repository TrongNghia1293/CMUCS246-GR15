package han;

import org.junit.Test;

import nguyen.Sort1;

import static org.junit.Assert.*;

public class Sort1Test {

    @Test
    public void testSortAscNumber1GreaterThanNumber2() {
        Sort1.number1 = 5;
        Sort1.number2 = 3;
        Sort1.sortAsc();
        assertEquals(3, Sort1.number1);
        assertEquals(5, Sort1.number2);
    }

    @Test
    public void testSortAscNumber1LessThanNumber2() {
        Sort1.number1 = 3;
        Sort1.number2 = 5;
        Sort1.sortAsc();
        assertEquals(3, Sort1.number1);
        assertEquals(5, Sort1.number2);
    }
}
