package leetcode.Medium._238;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void productExceptSelf() {
        int[] input = new int[]{1,2,3,4};
//        int[] input = new int[]{1,2,3,4, 5};
        int[] output = new int[]{24,12,8,6};
        assertArrayEquals(output, solution.productExceptSelf(input));
    }
}