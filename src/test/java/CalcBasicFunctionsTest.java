import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcBasicFunctionsTest
{

    @Test
    public void addTwoNumbersTest()
    {
      CalcBasicFunctions calcTest = new CalcBasicFunctions();

      double expected = 12;

      double actual = calcTest.addTwoNumbers(6,6);

      assertEquals("The result should be 12", expected, actual,.05);


    }

    @Test
    public void subTwoNumbers()
    {
        CalcBasicFunctions calcTest = new CalcBasicFunctions();

        double expected = 6;

        double actual = calcTest.subTwoNumbers(12,6);

        assertEquals("The result should be 6", expected,actual,0.05);

    }

    @Test
    public void multTwoNumbers()
    {
        CalcBasicFunctions calcTest = new CalcBasicFunctions();

        double expected = 9;

        double actual = calcTest.multTwoNumebrs(3,3);

        assertEquals("The Result should be 9", expected, actual,.05);
    }

    @Test
    public void divideTwoNumbers()
    {
        CalcBasicFunctions calcTest = new CalcBasicFunctions();

        double expected = 3;

        double actual = calcTest.divideTwoNumbers(9, 3);

        assertEquals("The result should be 3", expected, actual, .05);
    }

}
