package Hard._297;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodecTest {

    private Codec solution;
    private Solution queueSolution;

    @BeforeEach
    void setUp() {
        solution = new Codec();
        queueSolution = new Solution();
    }

    @Test
    void serialize() {
        TreeNode root = new TreeNode(1);
        TreeNode one = new TreeNode(2);
        TreeNode two = new TreeNode(3);
        TreeNode three = new TreeNode(4);
        TreeNode four = new TreeNode(5);

        root.left = one;
        root.right = two;
        two.left = three;
        two.right = four;

        assertEquals("1#2# # #3#4# # #5# # #", queueSolution.serialize(root));
        assertEquals("1#2# # #3#4# # #5# # #", solution.serialize(root));
        assertEquals(root, solution.deserialize("1#2# # #3#4# # #5# # #"));

    }
}