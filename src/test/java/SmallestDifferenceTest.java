import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {

    public void commonPatch(int[] arrayGiven, int[] expectedResult) {
        SmallestDifference smallestDifference = new SmallestDifference();
        int[] actualResult = smallestDifference.getSmallestDifference(arrayGiven);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSmallestDifference() {

        int[] arrayGiven = {8, 5, 2, 0, 9, 12, 8};
        int[] expectedResult = {8, 8};

        commonPatch(arrayGiven, expectedResult);
    }

    @Test
    public void testSmallestDifference2() {

        int[] arrayGiven = {8, -55, 2, -54, -12};
        int[] expectedResult = {-55, -54};

        commonPatch(arrayGiven, expectedResult);
    }

    @Test
    public void testSmallestDifference3() {

        int[] arrayGiven = {8, -55, 2, -54, -12};
        int[] expectedResult = {-55, -54};

        commonPatch(arrayGiven, expectedResult);
    }

    @Test
    public void testSmallestDifference4() {

        int[] arrayGiven = {0, 0, 0, 0, 0};
        int[] expectedResult = {0, 0};

        commonPatch(arrayGiven, expectedResult);
    }

    @Test
    public void testSmallestDifference5() {

        int[] arrayGiven = {1, 1, 1, 1, 1};
        int[] expectedResult = {1, 1};

        commonPatch(arrayGiven, expectedResult);
    }

    @Test
    public void testSmallestDifference6() {

        int[] arrayGiven = {5, 5};
        int[] expectedResult = {5, 5};

        commonPatch(arrayGiven, expectedResult);
    }

    @Test
    public void testSmallestDifference7() {

        int[] arrayGiven = {5};
        int[] expectedResult = {0, 0};

        commonPatch(arrayGiven, expectedResult);
    }
}
