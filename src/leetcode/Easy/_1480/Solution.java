package leetcode.Easy._1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        for (int i =0; i < len; i++) {
            if (i == 0) {
                res[i] = nums[i];
                continue;
            }

            res[i] = res[i-1] + nums[i];
        }
        
        return res;
    }
}
