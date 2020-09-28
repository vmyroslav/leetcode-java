package leetcode.Easy._268;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void missingNumber() {
        int[] input = new int[]{9,6,4,2,3,5,7,0,1};
        int output = 8;

        Assertions.assertEquals(output, (new Solution()).missingNumber(input));
    }
}