package fizzbuzz;

public class FizzBuzz {
    public String forNumber(Integer number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number.toString();
        }
    }

    public StringBuilder generateSequence(Integer length) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= length; i++) {
            result.append(this.forNumber(i));

            if (i < length) {
                result.append(", ");
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
