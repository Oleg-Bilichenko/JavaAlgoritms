import org.junit.Assert;
import org.junit.Test;

public class SumAndDifferenceTest {

    @Test
    public void testSum() {
        int n = 222;
        int expectedResult = 24753;

        SumAndDifference sumAndDifference = new SumAndDifference();
        int actualResult = sumAndDifference.calculationResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDifference() {
        int n = -10;
        int expectedResult = 56;

        SumAndDifference sumAndDifference = new SumAndDifference();
        int actualResult = sumAndDifference.calculationResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testzero() {
        int n = 0;
        int expectedResult = 0;

        SumAndDifference sumAndDifference = new SumAndDifference();
        int actualResult = sumAndDifference.calculationResult(n);

        Assert.assertEquals(expectedResult, actualResult);
    }
}