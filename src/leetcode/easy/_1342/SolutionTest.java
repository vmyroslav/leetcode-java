package leetcode.easy._1342;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numberOfSteps() {
        int input = 14;
        int output = 6;
        Solution solution = new Solution();

        Assertions.assertEquals(output, solution.numberOfSteps(input));
    }
}