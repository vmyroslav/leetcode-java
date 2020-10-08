package leetcode.Hard._128;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/longest-consecutive-sequence/
public class Solution {
    //Time: O(n); Space: O(n)
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> map = new HashSet<>();

        for (int num: nums) {
            map.add(num);
        }

        for (int num: nums) {
            if (!map.contains(num - 1)) {
                int localStreak = 1;
                int currNum = num;

                while(map.contains(currNum + 1)) {
                    localStreak++;
                    currNum++;
                }

                max = Math.max(max, localStreak);
            }
        }

        return max;
    }
}
