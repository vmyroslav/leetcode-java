package leetcode.Medium._39;

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
    void combinationSum() {
        int[] input = new int[]{2,3,6,7};
        List<List<Integer>> output = Arrays.asList(
                Arrays.asList(2, 2, 3),
                Arrays.asList(7)
        );

        List<List<Integer>> result = solution.combinationSum(input, 7);

        assertTrue(output.size() == result.size() &&
                output.containsAll(result) && result.containsAll(output));
    }

    @Test
    void combinationSumSecond() {
        int[] input = new int[]{2, 3, 5};
        List<List<Integer>> output = Arrays.asList(
                Arrays.asList(2, 2, 2, 2),
                Arrays.asList(2, 3, 3),
                Arrays.asList(3, 5)
        );

        List<List<Integer>> result = solution.combinationSum(input, 8);

        assertTrue(output.size() == result.size() &&
                output.containsAll(result) && result.containsAll(output));
    }
}