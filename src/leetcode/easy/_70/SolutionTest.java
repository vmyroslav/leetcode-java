package leetcode.easy._70;

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
    void climbStairs() {
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
    }
}