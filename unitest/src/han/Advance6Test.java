package han;

import org.junit.jupiter.api.Test;

import nguyen.Advance6;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class Advance6Test {

    @Test
    void testTinhTuoi() {
        Advance6 advance6 = new Advance6();
        int result = advance6.tinhTuoi(12, 1, 1999);
        assertEquals(25, result); // Assuming the current date is after January 12, 2024
    }

    @Test
    void testTinhTuoiForFutureDate() {
        Advance6 advance6 = new Advance6();
        int result = advance6.tinhTuoi(12, 5, 2005);
        assertEquals(-1, result); // Future date, should return -1
    }

    @Test
    void testTinhTuoiForInvalidDate() {
        Advance6 advance6 = new Advance6();
        int result = advance6.tinhTuoi(29, 2, 2023);
        assertEquals(-1, result); // Invalid date (non-leap year), should return -1
    }

    @Test
    void testTinhTuoiForToday() {
        Advance6 advance6 = new Advance6();
        int currentYear = LocalDate.now().getYear();
        int result = advance6.tinhTuoi(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), currentYear);
        assertEquals(0, result); // Should return 0 for today's date
    }
}
