package leetcode.easy._387;

import java.util.HashMap;

// https://leetcode.com/problems/first-unique-character-in-a-string/solution/

public class Solution {
    // Time: O(n); Space: O(1)
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
