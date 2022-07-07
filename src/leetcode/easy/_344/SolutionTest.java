package leetcode.easy._344;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reverseStringOddCount() {
        char[] input =  new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] output =  new char[]{'o', 'l', 'l', 'e', 'h'};

        solution.reverseString(input);

        assertArrayEquals(output, input);
    }

    @Test
    void reverseStringEvenCount() {
        char[] input =  new char[]{'b', 'a', 'r', 'k',};
        char[] output =  new char[]{'k', 'r', 'a', 'b'};

        solution.reverseString(input);

        assertArrayEquals(output, input);
    }
}