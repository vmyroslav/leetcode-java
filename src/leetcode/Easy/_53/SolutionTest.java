package leetcode.Easy._53;

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
    void maxSubArray() {
        assertEquals(6, solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(-1, solution.maxSubArray(new int[]{-1, -1, -1}));

    }
}