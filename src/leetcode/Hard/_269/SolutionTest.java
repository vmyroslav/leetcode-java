package leetcode.Hard._269;

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
    void alienOrder() {
        String[] input = new String[]{"wrt", "wrf", "er", "ett", "rftt"};
        assertEquals("wertf", solution.alienOrder(input));
    }
}