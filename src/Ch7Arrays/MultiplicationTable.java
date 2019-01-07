package Ch7Arrays;

import java.util.Arrays;

public class MultiplicationTable {

    public static void main(String[] args) {
        int[][] table = tableGen(4, 3);
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }

    public static int[][] tableGen(int x, int y) {
        int[][] table = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}
