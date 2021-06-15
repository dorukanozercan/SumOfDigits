
public class SumDigits {

    public static void main(String[] args) {
        // can take any number, calculates sum of digits
        int value = sumDigits(548);
        System.out.println("Sum of digits: " + value);
    }

    public static int sumDigits (int number) {
        int sum = 0;
        if (number >= 10) {
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
        return -1;

    }

}
