import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void beforeEach(){calculator = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    public void canDivide(){
        assertEquals(2.5, calculator.divide(5, 2), 0.01);
    }
}
