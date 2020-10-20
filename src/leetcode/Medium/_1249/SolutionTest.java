package leetcode.Medium._1249;

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
    void minRemoveToMakeValid() {
        assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"));
        assertEquals("", solution.minRemoveToMakeValid("))(("));
    }
}