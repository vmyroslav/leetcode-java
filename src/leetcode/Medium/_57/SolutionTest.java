package leetcode.Medium._57;

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
    void insert() {
        int[][] input = new int[][]{{1,3}, {6,9}};
        int[][] output = new int[][]{{1,5}, {6,9}};

        assertArrayEquals(output, solution.insert(input, new int[] {2, 5}));
    }
}