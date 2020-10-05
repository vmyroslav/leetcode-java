package leetcode.Medium._73;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;
    private SetSolution setSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        setSolution = new SetSolution();
    }

    @Test
    void setZeroes() {
        int[][] input = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] input2 = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] output = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        setSolution.setZeroes(input);
        solution.setZeroes(input2);

        assertArrayEquals(output, input);
        assertArrayEquals(output, input2);
    }

    @Test
    void setZeroesSecond() {
        int[][] input = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] input2 = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        int[][] output = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        setSolution.setZeroes(input);
        solution.setZeroes(input2);

        assertArrayEquals(output, input);
        assertArrayEquals(output, input2);
    }
}