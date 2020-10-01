package leetcode.Medium._40;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void combinationSum2() {
        int[] input = new int[]{10,1,2,7,6,1,5};
        List<List<Integer>> output = Arrays.asList(
                Arrays.asList(1, 7),
                Arrays.asList(1, 2, 5),
                Arrays.asList(2, 6),
                Arrays.asList(1, 1, 6)
        );

        List<List<Integer>> result = solution.combinationSum2(input, 8);

        assertTrue(output.size() == result.size() &&
                output.containsAll(result) && result.containsAll(output));
    }
}