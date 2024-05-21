package han;
import org.junit.jupiter.api.Test;

import nguyen.Advance7;

import static org.junit.jupiter.api.Assertions.*;

public class Advance7Test {

    @Test
    void testTinhThuForSunday() {
        Advance7 advance7 = new Advance7();
        int result = advance7.tinhThu(5, 4, 2020);
        assertEquals(1, result); // 5/4/2020 is Sunday (1)
    }

    @Test
    void testTinhThuForMonday() {
        Advance7 advance7 = new Advance7();
        int result = advance7.tinhThu(6, 4, 2020);
        assertEquals(2, result); // 6/4/2020 is Monday (2)
    }

    @Test
    void testTinhThuForInvalidDate() {
        Advance7 advance7 = new Advance7();
        int result = advance7.tinhThu(29, 2, 2023);
        assertEquals(0, result); // Invalid date (non-leap year), should return 0
    }

    @Test
    void testTinhThuForToday() {
        Advance7 advance7 = new Advance7();
        int currentDayOfWeek = java.time.LocalDate.now().getDayOfWeek().getValue();
        int result = advance7.tinhThu(java.time.LocalDate.now().getDayOfMonth(), java.time.LocalDate.now().getMonthValue(), java.time.LocalDate.now().getYear());
        assertEquals(currentDayOfWeek, result); // Should return current day of week
    }
}
