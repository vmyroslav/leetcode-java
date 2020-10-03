package leetcode.Medium._55;

import java.util.Arrays;

enum Index {
    GOOD, UNKNOWN
}


public class DPSolution {
    public boolean canJump(int[] nums) {
        Index[] memo = new Index[nums.length];
        Arrays.fill(memo, Index.UNKNOWN);

        memo[nums.length - 1] = Index.GOOD;
        for (int i = nums.length - 2; i >= 0 ; i--) {
            int maxJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i + 1; j <= maxJump; j++) {
                if (memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }

        return memo[0] == Index.GOOD;
    }
}
