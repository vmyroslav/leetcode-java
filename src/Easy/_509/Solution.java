package Easy._509;

// https://leetcode.com/problems/fibonacci-number/

public class Solution {
    //Time: O(N); Space: O(1)
    public int fib(int N) {

        if (N <= 1) {
            return N;
        }

        int x = 0;
        int y = 1;
        int res = 0;

        while (--N > 0) {
            res = x + y;
            x = y;
            y = res;
        }

        return res;
    }
}
