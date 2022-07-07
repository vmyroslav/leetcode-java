package leetcode.easy._680;

// https://leetcode.com/problems/valid-palindrome-ii/

public class Solution {
    // Time: O(n); Space: O(1)
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isValidRange(s, start, end - 1) || isValidRange(s, start + 1, end);
            }
            start++;
            end--;
        }

        return true;
    }

    private boolean isValidRange(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
