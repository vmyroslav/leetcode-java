package leetcode.Medium._968;

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
    void intervalIntersection() {
        int[][] inputA = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] inputB = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] output = new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};

        assertArrayEquals(output, solution.intervalIntersection(inputA, inputB));
    }
}