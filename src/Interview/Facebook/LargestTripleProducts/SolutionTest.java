package Interview.Facebook.LargestTripleProducts;

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
    void findMaxProduct() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] output = new int[]{-1, -1, 6, 24, 60};

        assertArrayEquals(output, solution.findMaxProduct(input));
    }

    @Test
    void findMaxProductSecond() {
        int[] input = new int[]{2, 1, 2, 1, 2};
        int[] output = new int[]{-1, -1, 4, 4, 8};

        assertArrayEquals(output, solution.findMaxProduct(input));
    }
}