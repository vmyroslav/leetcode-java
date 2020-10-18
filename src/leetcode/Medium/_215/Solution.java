package leetcode.Medium._215;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-an-array/

public class Solution {
    //Time: O(n * log(k)); Space: O(k)
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);

        for (int n: nums) {
            minHeap.add(n);
            if (minHeap.size() > k) minHeap.poll();
        }


        return minHeap.poll();
    }
}
