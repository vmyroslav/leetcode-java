package leetcode.easy._20

import java.util.Stack

class KSolution {
    fun isValid(s: String): Boolean {
        val stack: Stack<Char> = Stack()

        for (c in s) {
            when (c) {
                '(' -> stack.push(')')
                '[' -> stack.push(']')
                '{' -> stack.push('}')
                else -> if (stack.empty() || stack.pop() != c) return false
            }
        }

        return stack.empty()
    }
}