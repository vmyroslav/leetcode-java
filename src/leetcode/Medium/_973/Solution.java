package leetcode.Medium._973;

import java.util.Arrays;

// https://leetcode.com/problems/k-closest-points-to-origin/

public class Solution {
    //Time: O(n * log(n)); Space:O(n)
    public int[][] kClosest(int[][] points, int K) {
        int[][] res = new int[K][2];
        int[] dists = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            dists[i] = distance(points[i]);
        }

        Arrays.sort(dists);
        int edge = dists[K - 1];
        int counter = 0;

        for (int i = 0; i < points.length; i++) {
            if (distance(points[i]) <= edge) res[counter++] = points[i];
        }


        return res;
    }
    
    private int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
