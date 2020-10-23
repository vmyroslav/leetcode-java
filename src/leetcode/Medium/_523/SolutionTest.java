package leetcode.Medium._523;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void checkSubarraySum() {
        assertTrue(solution.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));
        assertTrue(solution.checkSubarraySum(new int[]{23, 2, 6, 4, 7}, 6));
    }
}