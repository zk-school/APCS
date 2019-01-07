package Ch7Arrays;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int aa[] = {1, 2, 3};
        JonnyAlgo(aa);
        System.out.println(Arrays.toString(aa));
    }

    public static void JonnyAlgo(int[] ja) {
        for (int i = 0; i <= ja.length - 1; i++) {
            int temp = ja[i];
            ja[ja.length - i] = temp;
        }
        // Insert return statement here.
    }

    public static void AbbyAlgo(int[] aa) {
        // Step 1: create temp. int. array of same size.
        int[] temp = new int[aa.length];
        // Step 2: copy original contents into new array.
        for (int i = aa.length; i >= 0; i--) {
            temp[aa.length - i - 1] = aa[i];
        }
        aa = temp;
    }
}
