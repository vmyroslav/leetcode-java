package leetcode.Medium._199;

import java.util.ArrayList;
import java.util.List;

public class DFSSolution {
    List<Integer> rightSide = new ArrayList<>();

    public void helper(TreeNode node, int level) {
        if (level == rightSide.size()) rightSide.add(node.val);
        if (node.right != null) helper(node.right, level + 1);
        if (node.left != null) helper(node.left, level + 1);
    }

    //Time: O(n); Space:O(H)
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return rightSide;

        helper(root, 0);
        return rightSide;
    }
}
