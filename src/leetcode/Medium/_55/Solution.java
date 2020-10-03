package leetcode.Medium._55;

// https://leetcode.com/problems/jump-game/

public class Solution {
    //Time: O(n); Space(O(1))
    public boolean canJump(int[] nums) {
        int lastPosition = nums.length - 1;

        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (i + nums[i] >= lastPosition) {
                lastPosition = i;
            }
        }

        return lastPosition == 0;
    }
}
