package leetcode.Hard._340;

import java.util.HashMap;

// https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/

public class Solution {
    //Time: O(n); Space: O(k)
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) return 0;

        int res = 0;
        int start = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

            while (freqMap.size() > k) {
                char cStart = s.charAt(start);
                freqMap.put(cStart, freqMap.get(cStart) - 1);
                if (freqMap.get(cStart) == 0) {
                    freqMap.remove(cStart);
                }
                start++;
            }
            res = Math.max(res, end - start + 1);
        }

        return res;
    }
}
