import org.junit.Assert;
import org.junit.Test;

public class GreaterValueTest {

    @Test
    public void testGreaterValue() {

        int firstNumber = 3333;
        int secondNumber = 9999;
        int expectedRes = 9999;

        GreaterValue greaterValue = new GreaterValue();
        int actualRes = greaterValue.getGreaterValue(firstNumber, secondNumber);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testGreaterValue1() {

        int firstNumber = 4;
        int secondNumber = -55;
        int expectedRes = 4;

        GreaterValue greaterValue = new GreaterValue();
        int actualRes = greaterValue.getGreaterValue(firstNumber, secondNumber);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testGreaterValue2() {

        int firstNumber = 0;
        int secondNumber = -35;
        int expectedRes = 0;

        GreaterValue greaterValue = new GreaterValue();
        int actualRes = greaterValue.getGreaterValue(firstNumber, secondNumber);

        Assert.assertEquals(expectedRes, actualRes);
    }
}
