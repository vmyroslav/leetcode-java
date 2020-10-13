package leetcode.Medium._139;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void wordBreak() {
        assertTrue(solution.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }
}