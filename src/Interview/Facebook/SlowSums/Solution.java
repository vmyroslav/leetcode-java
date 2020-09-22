package Interview.Facebook.SlowSums;

import java.util.Arrays;

public class Solution {
    public int getTotalTime(int[] arr) {
        // Write your code here

        Arrays.sort(arr);

        int penalty = 0;
        int sum = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            sum += arr[i];
            penalty += sum;
        }

        return penalty;

    }
}
