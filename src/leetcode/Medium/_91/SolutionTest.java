package leetcode.Medium._91;

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
    void numDecodings() {

        assertEquals(2, solution.numDecodings("12"));
        assertEquals(3, solution.numDecodings("226"));
        assertEquals(9, solution.numDecodings("2264123"));
    }
}