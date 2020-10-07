package leetcode.Medium._102;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void levelOrder() {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7))
        );

        List<List<Integer>> output = new LinkedList<>();
        output.add(Arrays.asList(3));
        output.add(Arrays.asList(9, 20));
        output.add(Arrays.asList(15, 7));
        assertEquals(output, solution.levelOrder(root));
    }
}