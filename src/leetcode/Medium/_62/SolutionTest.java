package leetcode.Medium._62;

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
    void uniquePaths() {
        assertEquals(28, solution.uniquePaths(3, 7));
        assertEquals(3, solution.uniquePaths(3, 2));
        assertEquals(6, solution.uniquePaths(3, 3));
    }
}