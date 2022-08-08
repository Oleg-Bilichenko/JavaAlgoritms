public class GreaterValue {

/*    public int getGreaterValue1(int firstNumber, int secondNumber) {
        int max = secondNumber;
        if (firstNumber > secondNumber) {
            max = firstNumber;
        }
        return max;
    }
 */

/*    public int getGreaterValue2(int firstNumber, int secondNumber) {
 *       if (firstNumber > secondNumber) {
 *           return firstNumber;
 *       }
 *       return secondNumber;
 *   }
 */

    public int getGreaterValue(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }
}
