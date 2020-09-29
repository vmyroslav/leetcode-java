package leetcode.Medium._5;

// https://leetcode.com/problems/longest-palindromic-substring/solution/

public class Solution {
    //Time: O(n^2); Space: O(1)
    public String longestPalindrome(String s) {
        if (s.isEmpty()) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i+ 1);
            int max = Math.max(len1, len2);

            if (end - start < max) {
                start = i - (max - 1) / 2;
                end = i + max / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}
