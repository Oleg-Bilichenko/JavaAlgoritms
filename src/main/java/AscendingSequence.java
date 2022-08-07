import java.util.Arrays;

public class AscendingSequence {

    public int[] ascendingSequence(int startNumber, int endNumber, int step) {

        int longArray;

        if (startNumber > endNumber) {
            int tempStartNumber = startNumber;
            startNumber = endNumber;
            endNumber = tempStartNumber;
        }

        if (step < 0) {
            step = Math.abs(step);
        }

        if (step == 0) {
            longArray = endNumber - startNumber;
        } else {
            longArray = (endNumber - startNumber) / step;
        }

        int newnumber = startNumber;
        int[] arreyResult = new int[longArray + 1];
        for (
                int i = startNumber - startNumber; i < (longArray + 1); i++) {
            arreyResult[i] = newnumber;
            newnumber += step;
        }

        System.out.println(Arrays.toString(arreyResult));
        return arreyResult;
    }
}
