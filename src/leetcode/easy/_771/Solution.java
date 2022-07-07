package leetcode.easy._771;

//https://leetcode.com/problems/jewels-and-stones/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // O(J+S)
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Set<Character> jewels = new HashSet<>();

        for (char c: J.toCharArray()) {
            jewels.add(c);
        }

        for (char c: S.toCharArray()) {
            if (jewels.contains(c)) {
                res++;
            }
        }

        return res;
    }
}
