import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequence1() {

        int startNumber = 10;
        int endNumber = 25;
        int step = -5;
        int[] expectedResult = {10, 15, 20, 25};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence2() {

        int startNumber = 10;
        int endNumber = -25;
        int step = -5;
        int[] expectedResult = {-25 , -20, -15, -10, -5, 0, 5, 10};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence3() {

        int startNumber = 10;
        int endNumber = 10;
        int step = 2;
        int[] expectedResult = {10};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence4() {

        int startNumber = 18;
        int endNumber = 3;
        int step = 3;
        int[] expectedResult = {3, 6, 9, 12, 15, 18};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence5() {

        int startNumber = 0;
        int endNumber = 0;
        int step = 3;
        int[] expectedResult = {0};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequence6() {

        int startNumber = 10;
        int endNumber = 14;
        int step = 0;
        int[] expectedResult = {10,10, 10, 10, 10};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.ascendingSequence(startNumber, endNumber, step);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }

}
