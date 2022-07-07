package leetcode.easy._953;

// https://leetcode.com/problems/verifying-an-alien-dictionary/solution/

public class Solution {
    //Time: O(N * total words len); Space: O(1)
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];

        for (int i = 0; i < 26; i++) {
            map[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!less(words[i], words[i + 1], map)) return false;
        }

        return true;
    }

    private boolean less(String word1, String word2, int[] map) {
        int len = Math.min(word1.length(), word2.length());

        for (int i = 0; i < len; i++) {
            int c1 = map[word1.charAt(i) - 'a'];
            int c2 = map[word2.charAt(i) - 'a'];
            if (c1 != c2) return (c1 < c2);

        }

        return word1.length() <= word2.length();
    }
}
