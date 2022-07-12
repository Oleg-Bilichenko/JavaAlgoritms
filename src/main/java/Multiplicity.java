public class Multiplicity {

    String result = "-1";

    public String getMultiplicity(int m) {

        if (m % 3 == 0 && m % 5 == 0) {
            result = "Good Number";
        } else if (m % 3 == 0 && m % 5 != 0) {
            result = "Bad Number";
        } else if (m % 3 != 0 && m % 5 == 0) {
            result = "Poor Number";
        }

        return result;
    }

}