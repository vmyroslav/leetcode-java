package leetcode.Medium._55;

// https://leetcode.com/problems/jump-game/

public class BacktrackSolution {
    //Time: O(2^n); Space(O(n))
    public boolean canJump(int[] nums) {
        return backtrack(0, nums);
    }

    private boolean backtrack(int position, int[] nums) {
        if (position == nums.length - 1) return true;

        int maxJump = Math.min(position + nums[position], nums.length - 1);
        for (int i = position + 1; i <= maxJump; i++) {
            if (backtrack(i, nums)) {
                return true;
            }
        }

        return false;
    }
}
