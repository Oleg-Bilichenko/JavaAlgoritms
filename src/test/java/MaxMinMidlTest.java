import org.junit.Assert;
import org.junit.Test;

public class  MaxMinMidlTest {

    @Test
    public void testMaxMinMidlTest() {
        int[] arrayGiven = {1, 2, 3, 4, 5};
        int[] expectedResult = {5, 1, 3};

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest1() {
        int[] arrayGiven = {-3, 0, 155, -39, 1003};
        int[] expectedResult = {1003, -39, 223};

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest2() {
        int[] arrayGiven = {1, 5, 3, 4, 2};
        int[] expectedResult = {5, 1, 3};

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest3() {
        int[] arrayGiven = {-2, 1, 5, 3, 4, 2, 8};
        int[] expectedResult = {8, -2, 3};

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest4() {
        int[] arrayGiven = {1};
        int[] expectedResult = {1, 1, 1};

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest5() {
        int[] arrayGiven = {1, 2};
        int[] expectedResult = {2, 1, 1};

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest6() {
        int[] arrayGiven = {};
        int[] expectedResult = null;

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMaxMinMidlTest7() {
        int[] arrayGiven = null;
        int[] expectedResult = null;

        MaxMinMidl maxMinMidl = new MaxMinMidl();
        int[] actualResult = maxMinMidl.arrayResult(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}