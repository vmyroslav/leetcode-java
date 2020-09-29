package leetcode.Medium._11;

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
    void maxArea() {
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}