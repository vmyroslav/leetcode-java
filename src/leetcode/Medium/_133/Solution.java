package leetcode.Medium._133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private final HashMap<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        Node newNode = copy(node);
        map.clear();

        return newNode;
    }

    private Node copy(Node node) {
        if (node == null) return null;
        if (map.containsKey(node.val)) return map.get(node.val);

        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(newNode.val, newNode);
        for (Node n: node.neighbors) {
            newNode.neighbors.add(copy(n));
        }

        return newNode;
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}