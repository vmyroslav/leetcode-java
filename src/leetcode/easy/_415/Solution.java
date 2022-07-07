package leetcode.easy._415;

// https://leetcode.com/problems/add-strings/

public class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder res = new StringBuilder();

        int l = num1.length() - 1;
        int m = num2.length() - 1;

        while (l >= 0 || m >= 0) {
            int n1 = l >= 0 ? num1.charAt(l) - '0' : 0;
            int n2 = m >= 0 ? num2.charAt(m) - '0' : 0;
            int x = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;
            res.append(x);
            l--;
            m--;
        }

        if (carry != 0) res.append(carry);

        return res.reverse().toString();
    }
}
