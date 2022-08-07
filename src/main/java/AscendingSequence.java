import java.util.Arrays;

public class AscendingSequence {

    public int[] ascendingSequence(int startNumber, int endNumber, int step) {

        if (startNumber > endNumber){
             int tempStartNumber = startNumber;
            startNumber = endNumber;
            endNumber = tempStartNumber;
            step = Math.abs(step);
        }

        int newnumber = startNumber;
        int[] arreyResult = new int[(endNumber - startNumber)/step + 1];
        for (int i = startNumber - startNumber; i < ((endNumber - startNumber)/step + 1); i++) {
            arreyResult[i] = newnumber;
            newnumber += step;
        }

        System.out.println(Arrays.toString(arreyResult));
        return arreyResult;
    }
}
