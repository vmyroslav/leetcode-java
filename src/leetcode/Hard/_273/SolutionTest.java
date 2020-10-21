package leetcode.Hard._273;

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
    void numberToWords() {
        assertEquals("One Hundred Twenty Three", solution.numberToWords(123));
        assertEquals(
                "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven",
                solution.numberToWords(1234567)
        );
    }
}