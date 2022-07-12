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
        int number = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven5() {
        int number = - 2147483648 - 1;
        String expectedResult = "Undefined";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven6() {
        int number = 2147483647 + 2;
        String expectedResult = "Odd";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEven7() {
        int number = 2147483647 - 1;
        String expectedResult = "Even";

        OddEven oddEven = new OddEven();
        String actualResult = oddEven.oddEven(number);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
