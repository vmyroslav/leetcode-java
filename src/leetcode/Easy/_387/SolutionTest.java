package leetcode.Easy._387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void firstUniqChar() {
        String input = "loveleetcode";
        int output = 2;

        Assertions.assertEquals(output, (new Solution()).firstUniqChar(input));
    }
}