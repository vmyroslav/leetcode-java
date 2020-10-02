package leetcode.Easy._53;

// https://leetcode.com/problems/maximum-subarray/

public class Solution {
    //Time: O(n); Space: O(1)
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return -1;

        int totalMax = nums[0];
        int localMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            totalMax = Math.max(localMax, totalMax);
        }

        return totalMax;
    }
}
