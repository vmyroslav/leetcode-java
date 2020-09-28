package Medium._287;

// https://leetcode.com/problems/find-the-duplicate-number/solution/

public class Solution {
    //Time: O(n); Space: O(1)
    public int findDuplicate(int[] nums) {
        if (nums.length == 0) return -1;

        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
