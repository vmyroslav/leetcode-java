package Interview.Facebook.QueueRemovals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void findPositions() {
        int[] inputArr = new int[]{1, 2, 2, 3, 4, 5};
        int inputX = 5;
        int[] output = new int[]{5, 6, 4, 1, 2};

        assertArrayEquals(output, solution.findPositions(inputArr, inputX));
    }
}