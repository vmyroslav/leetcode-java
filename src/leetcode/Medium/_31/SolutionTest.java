package leetcode.Medium._31;

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
    void nextPermutation() {
        int[] input = new int[]{1,2,3};
        int[] output = new int[]{1,3,2};

        solution.nextPermutation(input);
        assertArrayEquals(output, input);
    }
}