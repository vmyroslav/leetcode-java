package leetcode.Medium._15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
    void threeSum() {
        List<List<Integer>> output = new ArrayList<>();
        output.add(Arrays.asList(-1, -1, 2));
        output.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> outputSecond = new ArrayList<>();
        outputSecond.add(Arrays.asList(-2, 0, 2));

        assertEquals(output, solution.threeSum(new int[]{-1,0,1,2,-1,-4}));
        assertEquals(outputSecond, solution.threeSum(new int[]{-2,0,0,2,2}));

    }
}