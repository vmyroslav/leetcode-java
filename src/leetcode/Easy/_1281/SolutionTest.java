package leetcode.Easy._1281;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void subtractProductAndSum() {
        int input = 234;
        int output = 15;

        Assertions.assertEquals(output, (new Solution()).subtractProductAndSum(input));
    }
}