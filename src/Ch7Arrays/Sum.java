package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sum {

    // Maximum length of numbers/corresponding digit arrays.
    public static final int DIGITS = 25;

    public static void main(String[] args) throws FileNotFoundException {
        // Opening the input file.
        Scanner input = new Scanner(new File("sum.txt"));
        analyze(input);
    }

    public static void analyze(Scanner input) {
        // This will be the number of lines from the text file that are processed by this program.
        int lines = 0;
        while (input.hasNextLine()) {
            // Retrieve the next line.
            String line = input.nextLine();
            // Break the line up into individual tokens.
            Scanner tokens = new Scanner(line);
            // This array represents the digits of our first operand.
            // It starts off with all 0s, so we need a helper method to start the addition.
            int[] operand = new int[DIGITS];
            // Beginning addition.
            initAdd(tokens, operand);
            while (tokens.hasNext()) {
                // Continuing the addition; will not run if there's only one number in the line.
                contAdd(tokens, operand);
            }
            // Showing the sum of the line.
            System.out.print(" = ");
            printAsNumber(operand);
            System.out.println();
            lines++;
        }
        // Now we print the total number of lines processed.
        System.out.println();
        System.out.println("Total lines = " + lines);
    }

    // This method retrieves and returns the next operand, known here and throughout the program as "nextOp."
    public static int[] getNextOperand(Scanner tokens) {
        String number = tokens.next();
        int lastDigitIndex = DIGITS - number.length();
        int[] nextOp = new int[DIGITS];
        for (int i = lastDigitIndex; i < DIGITS; i++) {
            nextOp[i] = Character.getNumericValue(number.charAt(i - lastDigitIndex));
        }
        return nextOp;
    }

    public static void addColumns(Scanner tokens, int operand[], int nextOp[]) {
        // Here, we add each column from right to left, just like in elementary school!
        for (int i = DIGITS - 1; i >= 0; i--) {
            operand[i] += nextOp[i];
            // Carry the 1.
            if (operand[i] > 9) {
                int currentDigit = operand[i] % 10;
                operand[i] = currentDigit;
                operand[i - 1]++;
            }
        }
    }

    // This is the helper method that initializes the addition, hence its name.
    // It gives operand (has all 0s at first) its correct value by adding it to the first number in the line.
    public static void initAdd(Scanner tokens, int operand[]) {
        int[] nextOp = getNextOperand(tokens);
        printAsNumber(nextOp);
        addColumns(tokens, operand, nextOp);
    }

    // This method continues the addition that initAdd started.
    // The difference between it and the above is that it prints a plus before every following number to show addition.
    public static void contAdd(Scanner tokens, int operand[]) {
        int[] nextOp = getNextOperand(tokens);
        System.out.print(" + ");
        printAsNumber(nextOp);
        addColumns(tokens, operand, nextOp);
    }

    public static void printAsNumber(int number[]) {
        // In case the array is all 0s, we use a default value of DIGITS - 1.
        // This ensures that the number will be printed no matter what.
        int lastDigitIndex = DIGITS - 1;
        for (int i = 0; i < DIGITS; i++) {
            // Find last digit of number, i.e. the first non-zero element in the array of digits.
            if (number[i] != 0) {
                lastDigitIndex = i;
                break;
            }
        }
        // Printing each digit in sequence.
        for (int i = lastDigitIndex; i < DIGITS; i++) {
            System.out.print(number[i]);
        }
    }

}
