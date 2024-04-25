
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    Calculator calc=new Calculator();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void additionTest()
    {
        assertEquals(5, calc.addition(2, 5));

    }
    @Test
    public void minusTest()
    {
        assertEquals(01, calc.minus(3, 2));
    }
    @Test
    public void multiplicationTest()
    {
        assertEquals(6, calc.multiplication(2, 3));
    }
    @Test
    public void divisionTest()
    {
        assertEquals(3, calc.division(6, 2));
    }
    @Test
    public void powerTest(){
        assertEquals(8, calc.power(2, 3));
    }
}
