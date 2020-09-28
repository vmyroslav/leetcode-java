package leetcode.Easy._953;

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
    void isAlienSorted() {
        assertTrue(solution.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        assertFalse(solution.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
    }
}