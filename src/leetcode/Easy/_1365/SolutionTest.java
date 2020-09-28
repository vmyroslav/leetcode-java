package leetcode.Easy._1365;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void smallerNumbersThanCurrent() {
        int[] input = {8,1,2,2,3};
        int[] output = {4,0,1,1,3};
        Assertions.assertArrayEquals(output, (new Solution()).smallerNumbersThanCurrent(input));
    }
}