package han;

import static org.junit.Assert.*;
import org.junit.Test;

import nguyen.Calculator2;

public class Calculator2Test {

    private Calculator2 sub;

	@Test
    public void testSubResultValue() {
    	sub = new Calculator2();
        sub.number1=99;
        sub.number2=19;
        sub.sub();
        int actual = sub.result;
        int expected = 80;
        assertEquals(actual, expected);


        int a=1000000000;
        int b=1000000000;
        int c=2000000000;
        assertEquals(a+b, c);

        int x=1000000000;
        int y=1000000000;
        int z=2000000000;
        assertEquals(x+y, z);
    }
}
