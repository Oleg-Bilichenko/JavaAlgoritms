public class FizzBuzzWoof {

    public String[] fizzBuzzWoof(int startNumber, int endNumber) {

        String[] numbers = new String[endNumber - startNumber + 1];
        int newNumber = startNumber;

        for (int i = startNumber - startNumber; i < (endNumber - startNumber + 1); i++) {

            String newString = Integer.toString(newNumber);
            numbers[i] = String.valueOf(newNumber);
            if (newNumber == 33) {
                numbers[i] = "Fizz Fizz Fizz";
            }
            if (newNumber == 55) {
                numbers[i] = "Buzz Buzz Buzz";
            }
            if (newNumber == 77) {
                numbers[i] = "Woof Woof Woof";
            }

            if (newString.contains("3") && newNumber % 3 == 0) {
                numbers[i] = "Fizz Fizz";
            } else if (newString.contains("3") || newNumber % 3 == 0) {
                numbers[i] = "Fizz";
            }

            if (newString.contains("5") && newNumber % 5 == 0) {
                numbers[i] = "Buzz Buzz";
            } else if (newString.contains("5") || newNumber % 5 == 0) {
                numbers[i] = "Buzz";
            }

            if (newString.contains("7") && newNumber % 7 == 0) {
                numbers[i] = "Woof Woof";
            } else if (newString.contains("7") || newNumber % 7 == 0) {
                numbers[i] = "Woof";
            }

            if (newNumber % (3 * 5) == 0 && newString.contains("5")) {
                numbers[i] = "Fizz Buzz Buzz";
            } else if (newNumber % (3 * 5) == 0) {
                numbers[i] = "Fizz Buzz";
            }

            if (newNumber % (3 * 7) == 0) {
                numbers[i] = "Fizz Woof";
            } else if (newNumber % (3 * 7) == 0)
                if (newNumber % (5 * 7) == 0 && newString.contains("5")) {
                    numbers[i] = "Buzz Woof Buzz";
                }
            newNumber += 1;
        }

        return numbers;
    }
}