package han;

import org.junit.Test;

import nguyen.Sort2;

import static org.junit.Assert.*;

public class Sort2Test {

    @Test
    public void testSortDescNumber1GreaterThanNumber2() {
        Sort2 sorter = new Sort2();
        sorter.number1 = 5;
        sorter.number2 = 3;
        sorter.sortDesc();
        assertEquals(5, sorter.number1);
        assertEquals(3, sorter.number2);
    }

    @Test
    public void testSortDescNumber1LessThanNumber2() {
        Sort2 sorter = new Sort2();
        sorter.number1 = 3;
        sorter.number2 = 5;
        sorter.sortDesc();
        assertEquals(5, sorter.number1);
        assertEquals(3, sorter.number2);
    }
}
