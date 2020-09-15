package Easy._268;

// https://leetcode.com/problems/missing-number/

public class Solution {
    // Time: O(n); Space O(1)
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int NSum = max * (max + 1) / 2;

        return NSum - sum(nums);
    }

    private int sum(int[] nums) {
        int sum = 0;

        for (int n: nums) {
            sum += n;
        }

        return sum;
    }
}
