import org.junit.Assert;
import org.junit.Test;

public class NumberComparisonTest {

    @Test
    public void testNumberComparison() {

        int firstNum = 89;
        int secondNum = 89;
        int expectedRes = 0;

        NumberComparison numberComparison = new NumberComparison();
        int actualRes = numberComparison.compareNumbers(firstNum, secondNum);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testNumberComparison1() {

        int firstNum = -89;
        int secondNum = 89;
        int expectedRes = -1;

        NumberComparison numberComparison = new NumberComparison();
        int actualRes = numberComparison.compareNumbers(firstNum, secondNum);

        Assert.assertEquals(expectedRes, actualRes);
    }

    @Test
    public void testNumberComparison2() {

        int firstNum = 89;
        int secondNum = -89;
        int expectedRes = 1;

        NumberComparison numberComparison = new NumberComparison();
        int actualRes = numberComparison.compareNumbers(firstNum, secondNum);

        Assert.assertEquals(expectedRes, actualRes);
    }
}