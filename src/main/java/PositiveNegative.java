public class PositiveNegative {

    public boolean getPositiveNegative(int number) {
        boolean resultNumber = true;
        if (number < 0) {
            resultNumber = false;
        }

        return resultNumber;
    }
}