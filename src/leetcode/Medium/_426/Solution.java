package leetcode.Medium._426;

// https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/

public class Solution {
    private Node first;
    private Node last;

    //Time: O(N); Space:O(N)
    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        dfs(root);
        last.right = first;
        first.left = last;

        return first;
    }

    private void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            if (last != null) {
                last.right = node;
                node.left = last;
            } else {
                first = node;
            }

            last = node;
            dfs(node.right);
        }
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}