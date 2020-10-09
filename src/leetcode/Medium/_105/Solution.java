package leetcode.Medium._105;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

import java.util.Objects;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0, 0, inorder.length - 1, preorder, inorder);
    }

    private TreeNode build(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart < 0 || preStart > preorder.length - 1 || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (root.val == inorder[i]) {
                inIndex = i;
            }
        }

        root.left = build(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        root.right = build(preStart + inIndex - inStart + 1,inIndex + 1, inEnd, preorder, inorder);

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode)) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
