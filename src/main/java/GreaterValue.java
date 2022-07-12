public class GreaterValue {

    public int getGreaterValue(int firstNumber, int secondNumber) {
        int max = secondNumber;

        if (firstNumber > secondNumber) {
            max = firstNumber;
        }

        return max;
    }
}
