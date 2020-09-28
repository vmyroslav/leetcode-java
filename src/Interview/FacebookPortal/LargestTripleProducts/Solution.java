package Interview.FacebookPortal.LargestTripleProducts;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] findMaxProduct(int[] arr) {
        // Write your code here
        int[] res = new int[arr.length];

        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > 3) {
                queue.poll();
            }

            if (i < 2) {
                res[i] = -1;
                continue;
            }

            int x = queue.poll();
            int y = queue.poll();
            int z = queue.poll();
            res[i] = x * y * z;
            queue.add(x);
            queue.add(y);
            queue.add(z);
        }

        return res;
    }
}
