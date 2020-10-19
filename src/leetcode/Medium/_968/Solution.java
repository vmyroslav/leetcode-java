package leetcode.Medium._968;

import java.util.ArrayList;

public class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int m = 0;
        int n = 0;
        ArrayList<int[]> res = new ArrayList<>();

        while (m < A.length && n < B.length) {
            int start = Math.max(A[m][0], B[n][0]);
            int end = Math.min(A[m][1], B[n][1]);

            if (start <= end) res.add(new int[]{start, end});

            if (A[m][1] < B[n][1]) {
                m++;
            } else {
                n++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}
