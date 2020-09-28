package leetcode.Medium._287;

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
    void findDuplicate() {
        assertEquals(2, solution.findDuplicate(new int[]{1,3,4,2,2}));
        assertEquals(9, solution.findDuplicate(new int[]{2,5,9,6,9,3,8,9,7,1}));
    }
}