package leetcode.Easy._1528;

//https://leetcode.com/problems/shuffle-string/

public class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            chars[indices[i]] = s.charAt(i);
        }

        return new String(chars);
    }
}
