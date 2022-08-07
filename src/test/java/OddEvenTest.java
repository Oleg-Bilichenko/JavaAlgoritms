import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testOddEven1() {
        int number = -345;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven2() {
        int number = 0;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven3() {
        int number = 222222;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven4() {
        long number = 2147483647L + 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven5() {
        long number = - 2147483648L - 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven6() {
        long number = 2147483647L + 2;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven7() {
        long number = 2147483647L - 1;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
