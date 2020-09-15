package Easy._1512;

// Source: https://leetcode.com/problems/number-of-good-pairs/

import java.util.HashMap;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            res += map.getOrDefault(n, 0) - 1;
        }

        return res;
    }
}
