package han;
import nguyen.Triangle;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    void testFirstNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(5);
        triangle.setNumber2(3);
        triangle.setNumber3(4);
        assertEquals(5, triangle.maxLength());
    }

    @Test
    void testSecondNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(3);
        triangle.setNumber2(5);
        triangle.setNumber3(4);
        assertEquals(5, triangle.maxLength());
    }

    @Test
    void testThirdNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(3);
        triangle.setNumber2(4);
        triangle.setNumber3(5);
        assertEquals(5, triangle.maxLength());
    }

    @Test
    void testInvalidInput() {
        Triangle triangle = new Triangle();
        triangle.setNumber1(-3); // Invalid input
        triangle.setNumber2(4);
        triangle.setNumber3(5);
        assertEquals(-1, triangle.maxLength());
    }
}
