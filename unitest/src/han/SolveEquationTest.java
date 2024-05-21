package han;

import org.junit.Test;

import nguyen.SolveEquation;

import static org.junit.Assert.assertEquals;

public class SolveEquationTest {

    @Test
    public void testLinearEquationMultiRoots() {
        SolveEquation solver = new SolveEquation();
        solver.setNumber1(0);
        solver.setNumber2(0);
        String result = solver.linearEquation();
        assertEquals("Multi roots", result);
    }

    @Test
    public void testLinearEquationNoRoot() {
        SolveEquation solver = new SolveEquation();
        solver.setNumber1(0);
        solver.setNumber2(5);
        String result = solver.linearEquation();
        assertEquals("No root", result);
    }

    @Test
    public void testLinearEquationOneRoot() {
        SolveEquation solver = new SolveEquation();
        solver.setNumber1(3);
        solver.setNumber2(0);
        String result = solver.linearEquation();
        assertEquals("One root", result);
    }
}
