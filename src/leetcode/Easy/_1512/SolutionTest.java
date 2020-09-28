package leetcode.Easy._1512;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void numIdenticalPairs() {

        int[] input = new int[]{1,2,3,1,1,3};
        int output = 4;
        Solution solution = new Solution();

        Assertions.assertEquals(output, solution.numIdenticalPairs(input));
    }
}