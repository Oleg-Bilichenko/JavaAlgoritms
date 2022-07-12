import org.junit.Assert;
import org.junit.Test;

public class OddIndexValuesTest {

    @Test
    public void testArrayOddValues1() {

        int[] inputArray = {-45, 590, 234, 985, 12, 68};
        int[] expectedArray = {590, 985, 68};

        OddIndexValues oddIndexValues = new OddIndexValues();
        int[] actualArray = oddIndexValues.arrayOddValues(inputArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testArrayOddValues2() {

        int[] inputArray = {-5, 0, 24, -985, 3, 6800, 7, 333};
        int[] expectedArray = {0, -985, 6800, 333};

        OddIndexValues oddIndexValues = new OddIndexValues();
        int[] actualArray = oddIndexValues.arrayOddValues(inputArray);

        Assert.assertArrayEquals(expectedArray, actualArray);
    }
}
