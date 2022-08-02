import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        int[] arrayGiven = {3, 4, 2, 6, 4, 3, 3, 3, 2, 2};
        int[] expectedResult = {3, 4, 2, 6};
        int number = expectedResult.length;

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.arrayRemoveDuplicates(arrayGiven, number);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicates2() {
        int[] arrayGiven = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        int number = expectedResult.length;

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] actualResult = removeDuplicates.arrayRemoveDuplicates(arrayGiven, number);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
