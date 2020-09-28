package educative.grokking.slidingWindow;

// https://www.educative.io/courses/grokking-the-coding-interview/JPKr0kqLGNP

public class MaxSumSubArrayOfSizeK {
    // Time: O(n); Space: O(1)
    public static int findMaxSumSubArray(int k, int[] arr) {
        int windowSum = 0;
        int start = 0;
        int maxSum = 0;

        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];
            if (end - start  >= k - 1) {
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= arr[start++];
            }
        }

        return maxSum;
    }
}
