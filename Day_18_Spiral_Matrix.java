public class Day_18_Spiral_Matrix {
    public static int[] spiralMatrix(int[][] MATRIX) {
        if (MATRIX.length == 0)
            return new int[0];

        int m = MATRIX.length, n = MATRIX[0].length;
        int[] result = new int[m * n];
        int index = 0, top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                result[index++] = MATRIX[top][i];
            top++;
            for (int i = top; i <= bottom; i++)
                result[index++] = MATRIX[i][right];
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result[index++] = MATRIX[bottom][i];
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result[index++] = MATRIX[i][left];
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int[] result = spiralMatrix(matrix);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}