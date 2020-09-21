package Interview.Facebook.PairSums;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int numberOfWays(int[] arr, int k) {
        int res = 0;
        int numPairs = 0;

        if (arr.length == 0) return res;

        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int key : map.keySet()) {
            int count = map.get(key);
            if (k == 2 * key) {
                numPairs += count * (count - 1) / 2;
                continue;
            }

            int diff = k - key;
            if (map.containsKey(diff)) {
                res = res + map.get(key);
            }
        }


        return res / 2 + numPairs;
    }
}
