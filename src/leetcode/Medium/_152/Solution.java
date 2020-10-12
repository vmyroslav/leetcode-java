package leetcode.Medium._152;

// https://leetcode.com/problems/maximum-product-subarray/

public class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(nums[i], Math.max(nums[i] * max, nums[i] * min));
            min = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * min));
            if (max > res) res = max;
        }

        return res;
    }
}
