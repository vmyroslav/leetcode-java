package leetcode.Medium._105;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0; // Index of current root in inorder
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }
        root.left = build(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = build(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return root;
    }
}

class TreeNode {
    int val;
    leetcode.Medium._105.TreeNode left;
    leetcode.Medium._105.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, leetcode.Medium._105.TreeNode left, leetcode.Medium._105.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
