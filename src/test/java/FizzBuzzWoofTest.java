import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {

    @Test
    public void testFizzBuzzWoofTest() {

        int startNumber = 1;
        int endNumber = 45;
        String[] expectedRes =
                {"1", "2", "Fizz Fizz", "4", "Buzz Buzz", "Fizz", "Woof Woof", "8", "Fizz", "Buzz", "11", "Fizz",
                        "Fizz", "Woof", "Fizz Buzz Buzz", "16", "Woof", "Fizz", "19", "Buzz", "Fizz Woof", "22", "Fizz",
                        "Fizz", "Buzz Buzz", "26", "Woof", "Woof", "29", "Fizz Buzz", "Fizz", "Fizz", "Fizz Fizz",
                        "Fizz", "Woof", "Fizz Fizz", "Woof", "Fizz", "Fizz Fizz", "Buzz", "41", "Fizz Woof",
                        "Fizz", "44", "Fizz Buzz Buzz"
                };

        FizzBuzzWoof fizzBuzzWoof = new FizzBuzzWoof();
        String[] actualRes = fizzBuzzWoof.fizzBuzzWoof(startNumber, endNumber);

        Assert.assertArrayEquals(expectedRes, actualRes);
    }
}