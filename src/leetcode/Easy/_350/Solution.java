package leetcode.Easy._350;

import java.util.ArrayList;
import java.util.HashMap;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int n: nums2) {
            Integer v = map.get(n);
            if (v != null && v > 0) {
                list.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
