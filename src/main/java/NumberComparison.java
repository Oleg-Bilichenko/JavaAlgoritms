public class NumberComparison {

    public int compareNumbers(int firstNum, int secondNum) {

        int number = 0;
        if (firstNum < secondNum) {
            number = -1;
        } else if (firstNum > secondNum) {
            number = 1;
        }

        return number;
    }
}