import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {

    public int[] arrayRemoveDuplicates(int[] arrayGiven, int number) {

        int[] arrayEnd = new int[number];
        for (int i = 0; i < arrayEnd.length; i++) {
            for (int j = 0; j < arrayGiven.length; j++) {
                if (arrayEnd[i] != arrayGiven[j]) {
                    arrayEnd[i] = arrayGiven[i];
                }
            }
        }

        System.out.println(Arrays.toString(arrayEnd));
        return arrayEnd;
    }
}
