package leetcode.Medium._347;

//https://leetcode.com/problems/top-k-frequent-elements/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    // TIme: O(n); Space: O(n)
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        List<Integer>[] list = new ArrayList[nums.length + 1];


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (list[freq] == null) {
                list[freq] = new ArrayList<>();
            }
            list[freq].add(key);
        }

        List<Integer> temp = new ArrayList<>();

        for (int i = list.length - 1; i >= 0; i--) {
            if (k == 0) {
                break;
            }

            if (list[i] == null) {
                continue;
            }

            temp.addAll(list[i]);
            k--;
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = temp.get(i);
        }

        return res;
    }
}
