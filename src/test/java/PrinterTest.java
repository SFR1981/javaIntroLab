import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);

    }

    @Test
    public void hasPages(){
        assertEquals(10, printer.getPages());

    }

    @Test
    public void canPrint(){
        printer.print(2,3);
        assertEquals(4, printer.getPages());
        assertEquals(94,printer.getToner());

    }

    @Test
    public void canRefill(){
        printer.refill();
        assertEquals(100, printer.getPages());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }


}
