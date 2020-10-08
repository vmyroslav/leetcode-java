package leetcode.Easy._121;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Solution {
    //Time: O(n); Space: O(1)
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            else if (prices[i] - min > maxProfit) maxProfit = prices[i] - min;
        }
        return maxProfit;
    }
}
