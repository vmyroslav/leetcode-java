package leetcode.Medium._3;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char endC = s.charAt(end);
            if  (map.containsKey(endC)) {
                start = Math.max(start, map.get(endC));
            }
            maxLen = Math.max(maxLen, end - start + 1);
            map.put(endC, end + 1);
        }

        return maxLen;
    }
}
