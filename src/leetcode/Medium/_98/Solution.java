package leetcode.Medium._98;

// https://leetcode.com/problems/validate-binary-search-tree/

public class Solution {
    //Time: O(n); Space:O(n)
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer low, Integer high) {
        if (node == null) return true;

        int val = node.val;
        if (low != null && val <= low) return false;
        if (high != null && val >= high) return false;

        if (!isValid(node.left, low, val)) return false;
        return isValid(node.right, val, high);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
