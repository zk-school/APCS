
import java.util.Arrays;

public class DigitFrequency {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mostFrequentDigit(6446)));
    }

    public static int[] mostFrequentDigit(int n) {
        int[] digits = new int[10];
        int i = 0;
        do {
            i = n % 10;
            digits[i]++;
            n = (n - i) % 10;
        } while (n != 0);
        return digits;
    }

}
