package Medium._560;

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
    void subarraySum() {
        int[] inputArr = new int[]{1, 1, 1};
        int k = 2;
        int output = 2;

        assertEquals(output, solution.subarraySum(inputArr, k));
    }

    @Test
    void subarraySumSecond() {
        int[] inputArr = new int[]{1, 1, 1, 4, -12, 2, 31, -1, 22};
        int k = 21;
        int output = 2;

        assertEquals(output, solution.subarraySum(inputArr, k));
    }
}