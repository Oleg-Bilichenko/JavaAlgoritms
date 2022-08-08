public class NumberComparison {
/*

    public int compareNumbers(int firstNum, int secondNum) {

        if (firstNum == secondNum) {
            return 0;
        }
        return (firstNum > secondNum) ? 1 : -1; // Ternary Operator
    }
*/

    public int compareNumbers(int firstNum, int secondNum) {
        return Integer.compare(firstNum, secondNum);
    }

}