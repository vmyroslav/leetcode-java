package leetcode.Hard._297;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

// Preorder traversal
public class Codec {
    private final String delimiter = "#";
    private final String empty = " ";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        return convertToString(root, sb);
    }

    private String convertToString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(empty).append(delimiter);
        } else {
            sb.append(node.val);
            sb.append(delimiter);
            convertToString(node.left, sb);
            convertToString(node.right, sb);
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if (data.isEmpty() || data.equals(empty)) return null;

        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(delimiter)));
        return convertToTree(queue);
    }

    private TreeNode convertToTree(Queue<String> queue) {
        if (queue.isEmpty()) return null;

        String c = queue.poll();

        if (c.equals(empty)) return null;
        TreeNode node = new TreeNode(Integer.parseInt(c));
        node.left = convertToTree(queue);
        node.right = convertToTree(queue);

        return node;
    }
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

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


