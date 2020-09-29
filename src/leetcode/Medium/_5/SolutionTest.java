package leetcode.Medium._5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void longestPalindrome() {
        assertEquals("aba", solution.longestPalindrome("babad"));
        assertEquals("cxabaxc", solution.longestPalindrome("qqqcxabaxcar"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }
}