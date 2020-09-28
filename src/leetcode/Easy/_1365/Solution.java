package leetcode.Easy._1365;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    // Time: O(n * log(n)). Space: O(n)
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int[] snapshot = nums.clone();

        HashMap<Integer, Integer> countMap = new HashMap<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            countMap.putIfAbsent(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = countMap.get(snapshot[i]);
        }

        return res;
    }
}
