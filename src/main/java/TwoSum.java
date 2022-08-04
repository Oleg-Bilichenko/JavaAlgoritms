import java.util.Arrays;

public class TwoSum {

    int[] arrayEnd = new int[2];

    public int[] getTwoSum(int[] arrayGiven, int targetNumber) {

        for (int i = 0; i < arrayGiven.length; i++) {
            for (int j = 1; j < arrayGiven.length; j++) {
                if (arrayGiven[i] + arrayGiven[j] == targetNumber) {
                    arrayEnd[0] = j;
                    arrayEnd[1] = i;
                }
            }
        }
        return arrayEnd;
    }
}
