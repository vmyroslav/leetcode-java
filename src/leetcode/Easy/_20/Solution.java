package leetcode.Easy._20;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/

public class Solution {
    //Time: O(n); Space: O(n)
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c: s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
}
