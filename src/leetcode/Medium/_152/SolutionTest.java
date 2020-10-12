package leetcode.Medium._152;

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
    void maxProduct() {
        assertEquals(6, solution.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, solution.maxProduct(new int[]{-2, 0, -1}));
    }
}