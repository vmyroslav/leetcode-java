package Interview.FacebookPortal.BalanceBrackets;

import java.util.Stack;

public class Solution {
    public boolean isBalanced(String s) {
        // Write your code here

        if (s.length() == 0) return true;
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char symb;

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            }

            switch (c) {
                case '}':
                    symb = stack.pop();
                    if (symb == '(' || symb == '[') return false;
                    break;
                case ']':
                    symb = stack.pop();
                    if (symb == '{' || symb == '(') return false;
                    break;
                case ')':
                    symb = stack.pop();
                    if (symb == '{' || symb == '[') return false;
                    break;
                default:
                    continue;
            }
        }

        return stack.isEmpty();
    }
}
