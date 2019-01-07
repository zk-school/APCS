package Ch7Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class WeatherAnalysis2 {
    
    public static void main(String[] args) {
        report(getInput());
    }

    public static int[] getInput() {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days];

        for (int i = 1; i <= temps.length; i++) {
            System.out.print("Day " + i + "'s high temp: ");
            temps[i - 1] = console.nextInt();
        }

        return temps;
    }

    public static void report(int[] temps) {
        double tempSum = 0;

        for (int i = 1; i <= temps.length; i++) {
            tempSum += temps[i - 1];
        }

        double average = tempSum / temps.length;
        int overAverage = 0;

        for (int i = 1; i <= temps.length; i++) {
            if (temps[i - 1] > average) {
                overAverage++;
            }
        }

        System.out.println("Average temp = " + round(average, 1));
        System.out.println(overAverage + " days were above average.");
        System.out.println();

        System.out.println("Temperatures: " + Arrays.toString(temps));
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 2] + ", " + temps[temps.length - 1]);
    }

    public static double round(double value, int places) {
        // This method is used to round longer decimals.
        // It makes use of the BigDecimal and RoundingMode classes.
        if (places < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
