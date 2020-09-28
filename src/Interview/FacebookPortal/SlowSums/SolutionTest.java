package Interview.FacebookPortal.SlowSums;

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
    void getTotalTime() {
        int[] input = new int[]{4, 2, 1, 3};
        int output = 26;

        assertEquals(output, solution.getTotalTime(input));
    }

    @Test
    void getTotalSecond() {
        int[] input = new int[]{7, 8, 1, 7, 8, 7};
        int output = 144;

        assertEquals(output, solution.getTotalTime(input));
    }
}