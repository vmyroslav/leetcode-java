package Medium._48;

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
    void rotate() {
        int[][] input = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] output = new int[][]{{7,4,1}, {8,5,2}, {9,6,3}};

        solution.rotate(input);
        assertArrayEquals(output, input);
    }

    @Test
    void rotateSecond() {
        int[][] input = new int[][]{{5,1,9,11}, {2,4,8,10}, {13,3,6,7}, {15,14,12,16}};
        int[][] output = new int[][]{{15,13,2,5}, {14,3,4,1}, {12,6,8,9}, {16,7,10,11}};

        solution.rotate(input);
        assertArrayEquals(output, input);
    }
}