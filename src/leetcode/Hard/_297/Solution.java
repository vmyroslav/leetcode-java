package leetcode.Hard._297;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

// BFS
public class Solution {
    private final String delimiter = "#";
    private final String empty = " ";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return empty;

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append(empty).append(delimiter);
                continue;
            } else {
                sb.append(node.val).append(delimiter);
            }

            queue.add(node.left);
            queue.add(node.right);
        }


        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        if (data.isEmpty() || data.equals(empty)) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        String[] datalist = data.split(delimiter);
        if (datalist.length == 0) return null;
        TreeNode root = new TreeNode(Integer.parseInt(datalist[0]));
        queue.add(root);

        for (int i = 1; i < datalist.length - 1 && !queue.isEmpty(); i++) {
            TreeNode parent = queue.poll();
            if (!datalist[i].equals(empty)) {
                TreeNode left = new TreeNode(Integer.parseInt(datalist[i]));
                parent.left = left;
                queue.add(left);
            }

            if (!datalist[++i].equals(empty)) {
                TreeNode right = new TreeNode(Integer.parseInt(datalist[i]));
                parent.right = right;
                queue.add(right);
            }
        }

        return root;
    }
}

