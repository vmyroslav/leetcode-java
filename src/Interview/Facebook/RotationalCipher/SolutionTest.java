package Interview.Facebook.RotationalCipher;

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
    void rotationalCipher() {
        String input = "Zebra-493?";
        int inputFactor = 3;
        String output = "Cheud-726?";

        assertEquals(output, solution.rotationalCipher(input, inputFactor));
    }
}