package leetcode.Hard._128;

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
    void longestConsecutive() {
        assertEquals(4, solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}