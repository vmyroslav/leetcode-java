package leetcode.Easy._1342;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class Solution {
    public int numberOfSteps (int num) {
        int res = 0;

        while (num != 0) {
            if (num % 2 ==0) {
                num /= 2;
            } else {
                num--;
            }
            res ++;
        }

        return res;
    }
}
