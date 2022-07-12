public class SumAndDifference {

    public int calculationResult(int n) {
        int result = 0;
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                result = result + i;
            }
        } else {
            result = 1;
            for (int i = 0; i >= n; i--) {
                result = result - i;
            }
        }

        return result;
    }
}