package Medium._48;

public class Solution {
    public void rotate(int[][] matrix) {

        if (matrix.length == 0) {
            return;
        }

        transpose(matrix);
        flipVerticals(matrix);

    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int value = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = value;
            }
        }
    }

    private void flipVerticals(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int value = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = value;
            }
        }
    }
}
