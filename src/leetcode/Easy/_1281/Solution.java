package leetcode.Easy._1281;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;

        while (n != 0) {
            int value = n % 10;
            sum += value;
            prod *= value;
            n /= 10;
        }

        return prod - sum;
    }
}
