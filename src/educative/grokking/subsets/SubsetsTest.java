package educative.grokking.subsets;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SubsetsTest {

    @Test
    void findSubsets() {
        int[] input = new int[]{1, 5, 3};
        List<List<Integer>> output = Arrays.asList(
                Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(5),
                Arrays.asList(3),
                Arrays.asList(1,5),
                Arrays.asList(1,3),
                Arrays.asList(5,3),
                Arrays.asList(1, 5,3)
        );

        List<List<Integer>> result = Subsets.findSubsets(input);

        assertTrue(output.size() == result.size() &&
                output.containsAll(result) && result.containsAll(output));
    }
}