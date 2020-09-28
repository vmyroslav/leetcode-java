package leetcode.Easy._125;

// https://leetcode.com/problems/valid-palindrome/

public class Solution {
    public boolean isPalindrome(String s) {
        //Time: O(n);
        if (s.isEmpty()) return true;
        StringBuilder sb = new StringBuilder();

        for (char c: s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }

        String newS = sb.toString();

        if (newS.isEmpty()) return true;
        int start = 0;
        int end = newS.length() - 1;

        while (start <= end) {
            if (newS.charAt(start) != newS.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }
}
