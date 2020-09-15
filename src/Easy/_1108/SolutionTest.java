package Easy._1108;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void defangIPaddr() {
        String input = "1.1.1.1";
        String output = "1[.]1[.]1[.]1";
        Solution solution = new Solution();

        Assertions.assertEquals(output, solution.defangIPaddr(input));

    }
}