package leetcode.Medium._56;

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
    void merge() {
        int[][] input = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] output = new int[][]{{1,6}, {8,10}, {15,18}};

        assertArrayEquals(output, solution.merge(input));
    }

    @Test
    void mergeSecond() {
        int[][] input = new int[][]{{1,4}, {4,5}};
        int[][] output = new int[][]{{1,5}};

        assertArrayEquals(output, solution.merge(input));
    }

}