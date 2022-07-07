package leetcode.easy._1528;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void restoreString() {
        String inputStr = "codeleet";
        int[] inputArr = {4,5,6,7,0,2,1,3};
        String output = "leetcode";

        Assertions.assertEquals(output, (new Solution()).restoreString(inputStr, inputArr));
    }
}