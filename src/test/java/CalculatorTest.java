import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    int num1;
    int num2;

    @Before
    public void before(){
        this.num1 = 3;
        this.num2 = 2;
    }



    @Test
    public void hasAdd(){
        assertEquals(5, Calculator.add(num1, num2), 0.01);
    }

    @Test
    public void hasSubtract(){
        assertEquals(1, Calculator.subtract(num1, num2), 0.01);
    }



}
