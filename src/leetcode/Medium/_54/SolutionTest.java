package leetcode.Medium._54;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void spiralOrder() {
        int[][] input = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8 ,9}};
        List<Integer> output = Arrays.asList(1,2,3,6,9,8,7,4,5);

        assertEquals(output, solution.spiralOrder(input));
    }
}