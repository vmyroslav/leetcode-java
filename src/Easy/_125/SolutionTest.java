package Easy._125;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void isPalindrome() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome("aa"));
        assertFalse(solution.isPalindrome("race a car"));
    }
}