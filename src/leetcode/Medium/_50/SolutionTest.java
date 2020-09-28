package leetcode.Medium._50;

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
    void myPow() {
        assertEquals(16, solution.myPow(2, 4));
        assertEquals(27, solution.myPow(3, 3));
        assertEquals(1024.00000, solution.myPow(2.00000, 10));
        assertEquals(0.25000, solution.myPow(2.00000, -2));
    }
}