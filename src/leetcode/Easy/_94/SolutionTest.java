package leetcode.Easy._94;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;
    private IterativeSolution iterativeSolution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        iterativeSolution = new IterativeSolution();
    }

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(
                1,
                null,
                new TreeNode(2, new TreeNode(3), null)
        );

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(2);

        assertEquals(result, solution.inorderTraversal(root));
        assertEquals(result, iterativeSolution.inorderTraversal(root));
    }
}