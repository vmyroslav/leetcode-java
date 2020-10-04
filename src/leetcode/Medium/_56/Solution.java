package leetcode.Medium._56;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

// https://leetcode.com/problems/merge-intervals/

public class Solution {
    //Time: O(n*log(n); Space: O(n)
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;
        LinkedList<int[]> res = new LinkedList<>();

        Arrays.sort(intervals, new IntervalComparator());

        for (int [] interval: intervals) {
            if (res.isEmpty() || interval[0] > res.getLast()[1]) {
                res.add(interval);
            } else {
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }
}

class IntervalComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
}
