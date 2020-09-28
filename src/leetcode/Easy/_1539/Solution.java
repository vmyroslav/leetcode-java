package leetcode.Easy._1539;

// https://leetcode.com/problems/kth-missing-positive-number/

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int findKthPositive(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();

        for (int value: arr) {
            set.add(value);
        }

        int i = 0;
        while (k > 0) {
            if (!set.contains(++i)) {
                k--;
            }
        }

        return i;
    }
}

class BinarySearchSolution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0; int r = arr.length;

        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] - 1 - mid < k) {
                l++;
            } else {
                r = mid;
            }
        }

        return l + k;
    }
}
