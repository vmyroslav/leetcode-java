package leetcode.easy._20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;
    private KSolution kSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        kSolution = new KSolution();
    }

    @Test
    void isValid() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("([)]"));
    }

    @Test
    void isValidK() {
        assertTrue(kSolution.isValid("()"));
        assertTrue(kSolution.isValid("()[]{}"));
        assertFalse(kSolution.isValid("([)]"));
    }
}