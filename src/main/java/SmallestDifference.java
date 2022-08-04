public class SmallestDifference {

    int minDiff = Integer.MAX_VALUE;

    public int[] getSmallestDifference(int[] arrayGiven) {
        int[] endArray = new int[2];

        for (int i = 0; i < arrayGiven.length; i++) {
            for (int j = i + 1; j < arrayGiven.length; j++) {

                int moduleDiff = Math.abs(arrayGiven[i] - arrayGiven[j]);
                if (minDiff > moduleDiff) {
                    minDiff = moduleDiff;
                    endArray[0] = arrayGiven[i];
                    endArray[1] = arrayGiven[j];
                }
            }
        }

        return endArray;
    }

}
