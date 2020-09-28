package leetcode.Easy._1523;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();

    }

    @Test
    void countOdds() {
        int inputLow = 3;
        int inputHigh = 7;
        int output = 3;

        assertEquals(output, solution.countOdds(inputLow, inputHigh));
    }
}