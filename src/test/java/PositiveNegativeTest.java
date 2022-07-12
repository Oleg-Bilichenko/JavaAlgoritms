import org.junit.Assert;
import org.junit.Test;

public class PositiveNegativeTest {

    @Test
    public void testPositiveNegative() {

        int number = 555;
        boolean expectedResult = true;

        PositiveNegative positiveNegative = new PositiveNegative();
        boolean actualResult = positiveNegative.getPositiveNegative(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNegative1() {

        int number = -500;
        boolean expectedResult = false;

        PositiveNegative positiveNegative = new PositiveNegative();
        boolean actualResult = positiveNegative.getPositiveNegative(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveNegative2() {

        int number = 0;
        boolean expectedResult = true;

        PositiveNegative positiveNegative = new PositiveNegative();
        boolean actualResult = positiveNegative.getPositiveNegative(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}