package Medium._49;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/solution/

public class Solution {
    //Time: O(n*k); Space: O(n*k)
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

        Map<String, List<String>> res = new HashMap<>();

        int[] charMap = new int[26];

        for (String word: strs) {
            Arrays.fill(charMap, 0);

            for (Character c: word.toCharArray()) {
                charMap[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < charMap.length; i++) {
                sb.append("#").append(charMap[i]);
            }

            List<String> bucket = res.getOrDefault(sb.toString(), new ArrayList<>());
            bucket.add(word);
            res.put(sb.toString(), bucket);
        }

        return new ArrayList<>(res.values());

    }
}
