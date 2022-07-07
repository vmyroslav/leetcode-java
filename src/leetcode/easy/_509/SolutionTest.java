package leetcode.easy._509;

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
    void fib() {

//        assertEquals(1, solution.fib(2));
//        assertEquals(3, solution.fib(4));
        assertEquals(21, solution.fib(8));
    }
}