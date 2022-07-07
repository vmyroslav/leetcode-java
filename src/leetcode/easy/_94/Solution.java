package leetcode.easy._94;

//https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.*;

public class Solution {
    // Time: O(n); O(n)
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        recursion(root, res);

        return res;
    }

    private void recursion(TreeNode treeNode, List<Integer> list) {
        if (treeNode != null) {
            recursion(treeNode.left, list);
            list.add(treeNode.val);
            recursion(treeNode.right, list);
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}