package leetcode.Medium._227;

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
    void calculate() {
        assertEquals(7, solution.calculate("3+2*2"));
        assertEquals(5, solution.calculate(" 3+5 / 2 "));
    }
}