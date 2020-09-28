package leetcode.Medium._230;

import java.util.ArrayList;
import java.util.Objects;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/solution/

public class Solution {
    // Time: O(n); Space: O(n)
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> res = traverse(root, new ArrayList<>());

        return res.get(k - 1);
    }

    private ArrayList<Integer> traverse(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return list;
        }

        traverse(root.left, list);
        list.add(root.val);
        traverse(root.right, list);

        return list;
    }
}

// * Definition for a binary tree node.
class TreeNode {
    int val;
    leetcode.Medium._230.TreeNode left;
    leetcode.Medium._230.TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, leetcode.Medium._230.TreeNode left, leetcode.Medium._230.TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof leetcode.Medium._230.TreeNode)) return false;
        leetcode.Medium._230.TreeNode treeNode = (leetcode.Medium._230.TreeNode) o;
        return val == treeNode.val &&
                Objects.equals(left, treeNode.left) &&
                Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
