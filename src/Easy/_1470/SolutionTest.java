package Easy._1470;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shuffle() {
        int[] input = new int[]{2,5,1,3,4,7};
        int[] output = new int[]{2,3,5,4,1,7};
        Solution solution = new Solution();

        Assertions.assertArrayEquals(output, solution.shuffle(input, 3));

    }
}