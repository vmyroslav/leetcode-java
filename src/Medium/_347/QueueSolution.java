package Medium._347;

//https://leetcode.com/problems/top-k-frequent-elements/

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSolution {
    //Time: O(n * log(k))
    public int[] topKFrequent(int[] nums, int k) {

        if (k == nums.length) {
            return nums;
        }

        int[] res = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for (int n: map.keySet()) {
            queue.add(n);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = queue.size() - 1; i >= 0; --i) {
            res[i] = queue.poll();
        }

        return res;
    }
}
