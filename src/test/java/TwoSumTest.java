import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    public void commonPatch(int[] arrayGiven, int[] expectedResult, int targetNumber) {
        TwoSum twoSum = new TwoSum();
        int[] actualResult = twoSum.getTwoSum(arrayGiven,targetNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testTwoSum() {
        int[] arrayGiven = {68, 5, 2, 100, 9, 12, 8};
        int[] expectedResult = {2, 6};
        int targetNumber = 10;

        commonPatch(arrayGiven, expectedResult, targetNumber);
    }

    @Test
    public void testTwoSum2() {
        int[] arrayGiven = {1, 20, 40, 60, -40, -20, -1};
        int[] expectedResult = {5, 0};
        int targetNumber = -19;

        commonPatch(arrayGiven, expectedResult, targetNumber);
    }

    @Test
    public void testTwoSum3() {
        int[] arrayGiven = {8, 5, 2, 0, 9, 12, 8};
        int[] expectedResult = {3, 5};
        int targetNumber = 12;

        commonPatch(arrayGiven, expectedResult, targetNumber);
    }
}
