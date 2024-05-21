package han;

import org.junit.jupiter.api.Test;

import nguyen.Advance5;

import static org.junit.jupiter.api.Assertions.*;

public class Advance5Test {

    @Test
    void testKiemTraDoiXungForSymmetricNumber() {
        Advance5 advance5 = new Advance5();
        boolean result = advance5.kiemTraDoiXung(12321);
        assertTrue(result);
    }

    @Test
    void testKiemTraDoiXungForNonSymmetricNumber() {
        Advance5 advance5 = new Advance5();
        boolean result = advance5.kiemTraDoiXung(12345);
        assertFalse(result);
    }

    @Test
    void testKiemTraDoiXungForSingleDigitNumber() {
        Advance5 advance5 = new Advance5();
        boolean result = advance5.kiemTraDoiXung(5);
        assertTrue(result);
    }

    @Test
    void testKiemTraDoiXungForNegativeNumber() {
        Advance5 advance5 = new Advance5();
        boolean result = advance5.kiemTraDoiXung(-121);
        assertFalse(result);
    }

    @Test
    void testKiemTraDoiXungForZero() {
        Advance5 advance5 = new Advance5();
        boolean result = advance5.kiemTraDoiXung(0);
        assertTrue(result);
    }
}
