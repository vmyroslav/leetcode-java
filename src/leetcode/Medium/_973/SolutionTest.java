package leetcode.Medium._973;

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
    void kClosest() {
        int [][] output = new int[][]{{2, -2}};
        int [][] input = new int[][]{{2, -2}, {1, 3}};

        assertArrayEquals(output, solution.kClosest(input, 1));
    }
}