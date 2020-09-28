package leetcode.Easy._1480;

import org.junit.jupiter.api.Assertions;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void runningSum() {
        var solution = new Solution();
        int[] input = {1,2,3,4};
        int[] output = {1,3,6,10};
        Assertions.assertArrayEquals(output, solution.runningSum(input));
    }
}