package leetcode.Medium._34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void searchRange() {
        assertArrayEquals(new int[]{3, 4}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }
}