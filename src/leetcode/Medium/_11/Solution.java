package leetcode.Medium._11;

// https://leetcode.com/problems/container-with-most-water/solution/

public class Solution {
    // Time: O(n); Space: O(1)
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (start <= end) {
            int s = (end - start) * (Math.min(height[start], height[end]));
            max = Math.max(max, s);
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }

        }

        return max;
    }
}
