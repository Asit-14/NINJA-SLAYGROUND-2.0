import java.util.ArrayList;
import java.util.Arrays;

public class Day_19_Zero_Matrix {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {
        // Create separate arrays to track rows and columns that need to be zeroed
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 0, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        matrix = zeroMatrix(matrix, 3, 3);
        for (ArrayList<Integer> row : matrix) {
            System.out.println(row);
        }

    }
}
