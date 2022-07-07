package leetcode.easy._67;

// https://leetcode.com/problems/add-binary/

public class Solution {
    // Time: O(max(a,b)); Space: O(max(a,b))
    public String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();

        while (m >= 0 || n >= 0) {
            int n1 = m >= 0 ? a.charAt(m) - '0' : 0;
            int n2 = n >= 0 ? b.charAt(n) - '0' : 0;
            int re = (carry + n1 + n2) % 2;
            carry = (carry + n1 + n2) / 2;
            res.append(re);
            m--;
            n--;
        }

        if (carry != 0) res.append(carry);

        return res.reverse().toString();
    }
}
