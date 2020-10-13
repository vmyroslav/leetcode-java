package leetcode.Medium._153;

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
    void findMin() {
        assertEquals(1, solution.findMin(new int[]{3,4,5,1,2}));
        assertEquals(0, solution.findMin(new int[]{4,5,6,7,0,1,2}));
    }
}