package Interview.Facebook.PairSums;

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
    void numberOfWays() {
        int[] input = new int[]{1, 2, 3, 4, 3};
        int inputK = 6;
        int output = 2;

        assertEquals(output, solution.numberOfWays(input, inputK));
    }

    @Test
    void numberOfWaysSecond() {
        int[] input = new int[]{1, 5, 3, 3, 3};
        int inputK = 6;
        int output = 4;

        assertEquals(output, solution.numberOfWays(input, inputK));
    }
}