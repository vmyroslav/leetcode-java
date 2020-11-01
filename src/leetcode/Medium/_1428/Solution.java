package leetcode.Medium._1428;

import java.util.List;

public class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        int rows = binaryMatrix.dimensions().get(0);
        int cols = binaryMatrix.dimensions().get(1);

        int currRow = 0;
        int currCol = cols - 1;
        int res = -1;

        while (currRow < rows && currCol >= 0) {
            if (binaryMatrix.get(currRow, currCol) == 1) {
                res = currCol;
                currCol--;
            } else {
                currRow++;
            }
        }

        return res;
    }
}

interface BinaryMatrix {
     int get(int row, int col);
     List<Integer> dimensions();
}