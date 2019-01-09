package Ch7Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class PersonalityTest {

    // This is a test.
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        System.out.print("Input file name: ");
        // Here we are importing the input file and checking whether it exists.
        File from = new File(console.nextLine());
        while (!from.exists()) {
            System.out.print("File not found. Try again: ");
            from = new File(console.nextLine());
        }
        System.out.print("Output file name: ");
        File to = new File(console.nextLine());
        Scanner input = new Scanner(from);
        PrintStream output = new PrintStream(to);
        while (input.hasNextLine()) {
            output.println(input.nextLine() + ":");
            if (input.hasNextLine()) {
                String responses = input.nextLine()
                        .toLowerCase()
                        .replaceAll("(.{7})", "$1\n");
                countResponses(responses, output);
            }
            output.println();
        }
    }

    public static void countResponses(String responses, PrintStream output) {
        Scanner input = new Scanner(responses);
        int[] aCount = new int[4];
        int[] bCount = new int[4];
        while (input.hasNextLine()) {
            String answers = input.nextLine();
            for (int i = 0; i < answers.length(); i++) {
                int j = i;
                if (j % 2 == 0) {
                    j /= 2;
                } else {
                    j = (j + 1) / 2;
                }
                if (answers.charAt(i) == 'a') {
                    aCount[j]++;
                }
                if (answers.charAt(i) == 'b') {
                    bCount[j]++;
                }
            }
        }
        getPercentage(aCount, bCount, output);
    }

    public static void getPercentage(int[] aCount, int[] bCount, PrintStream output) {
        int[] bPercent = new int[bCount.length];
        for (int i = 0; i < bPercent.length; i++) {
            bPercent[i] = (bCount[i] * 100) / (aCount[i] + bCount[i]);
        }
        showResults(aCount, bCount, bPercent, output);
    }

    public static void showResults(int[] aCount, int[] bCount, int[] bPercent, PrintStream output) {
        for (int i = 0; i < aCount.length; i++) {
            output.print(aCount[i] + "A-" + bCount[i] + "B ");
        }
        output.println();
        String percentages = Arrays.toString(bPercent)
                .replaceAll("(\\d+)", "$1%");
        String type = personalityType(bPercent);
        output.println(percentages + " = " + type);
    }

    public static String personalityType(int[] bPercent) {
        char[] type = {'X', 'X', 'X', 'X'};
        if (bPercent[0] > 50) {
            type[0] = 'I';
        } else if (bPercent[0] < 50) {
            type[0] = 'E';
        }
        if (bPercent[1] > 50) {
            type[1] = 'N';
        } else if (bPercent[1] < 50) {
            type[1] = 'S';
        }
        if (bPercent[2] > 50) {
            type[2] = 'F';
        } else if (bPercent[2] < 50) {
            type[2] = 'T';
        }
        if (bPercent[3] > 50) {
            type[3] = 'P';
        } else if (bPercent[3] < 50) {
            type[3] = 'J';
        }
        return new String(type);
    }

}
