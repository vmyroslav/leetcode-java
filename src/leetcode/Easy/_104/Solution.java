package leetcode.Easy._104;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

class TreeNode {
    int val;
    leetcode.Easy._104.TreeNode left;
    leetcode.Easy._104.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, leetcode.Easy._104.TreeNode left, leetcode.Easy._104.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
