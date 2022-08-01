import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer myPrinter;
    @Before
    public void beforeEach() {
        myPrinter = new Printer("Mr. Grumpy", 100, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Mr. Grumpy", myPrinter.getName());
    }

    @Test
    public void hasPaper(){
        assertEquals(100, myPrinter.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(100, myPrinter.getToner());
    }

    @Test
    public void canPrintIsAble(){
        myPrinter.print(5, 5);
        assertEquals(75, myPrinter.getPaper());
        assertEquals(75, myPrinter.getToner());
    }

    @Test
    public void canPrintIsNotAble(){
        myPrinter.print(11, 11);
        assertEquals(100, myPrinter.getPaper());
        assertEquals(100, myPrinter.getToner());
    }
}
