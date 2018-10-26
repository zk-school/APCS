import java.util.Arrays;

public class MultiplicationTable {

    public static void main(String[] args) {
        /* int[][] scores = { {3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
                {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
                {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
                {1, 1, 1, 3, 1, 2, 1, 3, 2, 4} };
        System.out.println(scores.length);
        System.out.println(Arrays.toString(scores[1])); */

        int[][] table = tableGen(3, 3);
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }

    public static int[][] tableGen(int x, int y) {
        int[][] table = new int[x][y];
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}
