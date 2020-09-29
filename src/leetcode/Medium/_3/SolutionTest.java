package leetcode.Medium._3;

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
    void lengthOfLongestSubstring() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}