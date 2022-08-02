import java.util.Arrays;

public class ZeroSum {

    public int[] arrayZeroSum(int[] arrayGiven) {

        int[] arrayEnd = new int[2];
        for (int i = 0; i < arrayGiven.length; i++) {
            for (int j = 1; j < arrayGiven.length; j++) {
                if (arrayGiven[i] + arrayGiven[j] == 0) {
                    arrayEnd[1] = arrayGiven[i];
                    arrayEnd[0] = arrayGiven[j];
                }
            }
        }

        System.out.println(Arrays.toString(arrayEnd));
        return arrayEnd;
    }
}

