package han;

import org.junit.jupiter.api.Test;

import nguyen.Advance1;

import static org.junit.jupiter.api.Assertions.*;

public class Advance1Test {

    @Test
    void testUSCLN() {
        Advance1 advance1 = new Advance1();
        int result = advance1.USCLN(24, 36);
        assertEquals(12, result);
    }

    @Test
    void testBSCNN() {
        Advance1 advance1 = new Advance1();
        int result = advance1.BSCNN(24, 36);
        assertEquals(72, result);
    }
}
