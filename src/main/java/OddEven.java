public class OddEven {

    public String oddEven(int number) {
        String result = "";

        if(number <= 2147483647 + 1 || number >= -2147483648 - 1) {
            result = "Undefined";
        } else if (number % 2 == 0) {
            result = "Even";
        } else if (number % 2 != 0) {
            result = "Odd";
        }

        return result;
    }
}
