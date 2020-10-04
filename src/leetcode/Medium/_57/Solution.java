package leetcode.Medium._57;

import java.util.LinkedList;

// https://leetcode.com/problems/insert-interval/

public class Solution {
    //Time: O(n); Space:O(n);
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][]{newInterval};

        int[] lastInterval = newInterval;
        LinkedList<int[]> res = new LinkedList<>();

        for (int [] interval: intervals) {
            if (lastInterval[1] < interval[0]) {
                res.add(lastInterval);
                lastInterval = interval;
            } else if (interval[1] >= lastInterval[0]) {
                int start = Math.min(lastInterval[0], interval[0]);
                int end = Math.max(lastInterval[1], interval[1]);
                lastInterval = new int[]{start, end};
            } else {
                res.add(interval);
            }
        }

        res.add(lastInterval);

        return res.toArray(new int[res.size()][2]);
    }
}
