package leetcode.easy._94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeSolution {
    // Time: O(n); O(n)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pointer = root;

        while (pointer != null || !stack.isEmpty()) {
            while (pointer != null) {
                stack.push(pointer);
                pointer = pointer.left;
            }

            pointer = stack.pop();
            res.add(pointer.val);
            pointer = pointer.right;
        }

        return res;
    }
}
