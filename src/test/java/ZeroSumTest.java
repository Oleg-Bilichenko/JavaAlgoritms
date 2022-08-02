import org.junit.Assert;
import org.junit.Test;

public class ZeroSumTest {

    @Test
    public void testRemoveDuplicates() {
        int[] arrayGiven = {35, 23, 12, 89, -23, -48, 100};
        int[] expectedResult = {23, -23};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.arrayZeroSum(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] arrayGiven = {10, 24, 12, 0, -23, 0, 38};
        int[] expectedResult = {0, 0};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.arrayZeroSum(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicates3() {
        int[] arrayGiven = {10, 24, 12, 0, -23, -0, 38};
        int[] expectedResult = {0, 0};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.arrayZeroSum(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicates4() {
        int[] arrayGiven = {10, -24, 12, 0, 24, 110, 38};
        int[] expectedResult = {-24, 24};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.arrayZeroSum(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicates5() {
        int[] arrayGiven = {-27, -14, 12, 0, 28, -14, 110, 14};
        int[] expectedResult = {-14, 14};

        ZeroSum zeroSum = new ZeroSum();
        int[] actualResult = zeroSum.arrayZeroSum(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
