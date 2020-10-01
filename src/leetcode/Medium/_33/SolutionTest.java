package leetcode.Medium._33;

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
    void search() {
        assertEquals(4, solution.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, solution.search(new int[]{4,5,6,7,0,1,2}, 3));
        assertEquals(1, solution.search(new int[]{4,5,6,7,0,1,2}, 5));
        assertEquals(2, solution.search(new int[]{5,6,7,1,2,3,4}, 7));
    }
}