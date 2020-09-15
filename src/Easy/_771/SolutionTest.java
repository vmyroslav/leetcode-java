package Easy._771;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numJewelsInStones() {
        String J = "aA";
        String S = "aAAbbbb";
        int output = 3;
        Solution solution = new Solution();

        Assertions.assertEquals(output, solution.numJewelsInStones(J, S));
    }
}