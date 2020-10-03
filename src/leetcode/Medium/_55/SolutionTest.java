package leetcode.Medium._55;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private BacktrackSolution backtrackSolution;
    private Solution solution;
    private DPSolution dpSolution;

    @BeforeEach
    void setUp() {
        backtrackSolution = new BacktrackSolution();
        solution = new Solution();
        dpSolution = new DPSolution();
    }

    @Test
    void canJump() {
        assertTrue(solution.canJump(new int[]{2,3,1,1,4}));
        assertTrue(backtrackSolution.canJump(new int[]{2,3,1,1,4}));
        assertTrue(dpSolution.canJump(new int[]{2,3,1,1,4}));
        assertFalse(solution.canJump(new int[]{3,2,1,0,4}));
        assertFalse(backtrackSolution.canJump(new int[]{3,2,1,0,4}));
        assertFalse(dpSolution.canJump(new int[]{3,2,1,0,4}));
    }
}