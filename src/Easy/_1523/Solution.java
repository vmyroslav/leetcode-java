package Easy._1523;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

public class Solution {
    public int countOdds(int low, int high) {

        int count = (high - low) / 2;

        if (isOdd(low) || isOdd(high))
            count++;

        return count;
    }

    private boolean isOdd(int value) {
        return value % 2 == 1;
    }
}
