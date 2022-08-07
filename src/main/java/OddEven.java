public class OddEven {

    public String oddEven(long number) {
        String result;

        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
            result = number % 2 == 0 ? "Even" : "Odd";
        } else {
            result = "Undefined";
        }

        return result;
    }
}
