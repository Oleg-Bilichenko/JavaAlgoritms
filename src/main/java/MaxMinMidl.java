public class MaxMinMidl {

    public int[] arrayResult(int[] arrayGiven) {

        int[] array = new int[3];

        if (arrayGiven == null || arrayGiven.length == 0) {
            return  null;
        } else {

            int max = arrayGiven[0];
            int min = arrayGiven[0];
            int midl = 0;


            for (int i = 0; i < arrayGiven.length; i++) {

                if (max < arrayGiven[i]) {
                    max = arrayGiven[i];
                }
                if (min > arrayGiven[i]) {
                    min = arrayGiven[i];
                }
                midl = midl + arrayGiven[i];
            }

            array[0] = max;
            array[1] = min;
            array[2] = midl / arrayGiven.length;

        }
        return array;
    }
}