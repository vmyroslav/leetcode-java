package leetcode.Medium._347;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;
    private QueueSolution queueSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        queueSolution = new QueueSolution();
    }

    @Test
    void topKFrequent() {

        int[] inputArr = new int[]{1,1,1,2,2,3};
        int[] output = new int[]{1,2};
        int inputK = 2;

        assertArrayEquals(output, solution.topKFrequent(inputArr, inputK));
        assertArrayEquals(output, queueSolution.topKFrequent(inputArr, inputK));
    }

    @Test
    void topKFrequentSecond() {

        int[] inputArr = new int[]{4,1,-1,2,-1,2,3};
        int[] output = new int[]{-1,2};
        int inputK = 2;

        assertArrayEquals(output, solution.topKFrequent(inputArr, inputK));
        assertArrayEquals(output, queueSolution.topKFrequent(inputArr, inputK));
    }
}