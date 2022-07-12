public class OddIndexValues {

    public int[] arrayOddValues(int[] inputArray) {

        int j = 0;
        int[] returnArray = new int[inputArray.length / 2];

            for (int i = 0; i < inputArray.length; i++) {
                if (i % 2 != 0) {
                    returnArray[j] = inputArray[i];
                    j++;
                }
            }

            return returnArray;
    }
}
