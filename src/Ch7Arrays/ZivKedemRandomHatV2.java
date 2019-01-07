package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZivKedemRandomHatV2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int teams = 0;
        while (teams == 0 || teams % 2 != 0) {
            System.out.print("Enter an even number of teams: ");
            teams = console.nextInt();
        }

        int[] a = new int[teams / 2];
        int[] b = new int[teams / 2];
        for (int i = 0; i < a.length; i++) {
            double rand = Math.random();
            System.out.println(rand);
            a[i] = 1 + (int)(rand * ((teams - 1) + 1));

            rand = Math.random();
            System.out.println(rand);
            b[i] = 1 + (int)(rand * ((teams - 1) + 1));
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
