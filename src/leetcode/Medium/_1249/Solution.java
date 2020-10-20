package leetcode.Medium._1249;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

public class Solution {
    // Time: O(n); Space: O(n)
    public String minRemoveToMakeValid(String s) {
        Set<Integer> indexes = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    indexes.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            indexes.add(stack.pop());
        }

        for (int i = 0; i < s.length(); i++) {
            if (!indexes.contains(i)) res.append(s.charAt(i));
        }

        return res.toString();
    }
}
