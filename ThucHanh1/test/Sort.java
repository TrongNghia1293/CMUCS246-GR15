import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Sort {
int number1;
int number2;
    public Sort() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   @Test
    public void testSortDesc_whenNumber1LessThanNumber2() {
        Sort sorter = new Sort();
        sorter.number1 = 2;
        sorter.number2 = 5;
        
        sorter.sortDesc();
        
        assertEquals(5, sorter.number1);
        assertEquals(2, sorter.number2);
    }

    @Test
    public void testSortDesc_whenNumber1GreaterThanNumber2() {
        Sort sorter = new Sort();
        sorter.number1 = 7;
        sorter.number2 = 3;
        
        sorter.sortDesc();
        
        assertEquals(7, sorter.number1);
        assertEquals(3, sorter.number2);
    }

    @Test
    public void testSortDesc_whenNumber1EqualsNumber2() {
        Sort sorter = new Sort();
        sorter.number1 = 5;
        sorter.number2 = 5;
        
        sorter.sortDesc();
        
        assertEquals(5, sorter.number1);
        assertEquals(5, sorter.number2);
    }

    private void sortDesc() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
