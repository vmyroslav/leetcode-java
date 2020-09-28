package educative.grokking.slidingWindow;

// https://www.educative.io/courses/grokking-the-coding-interview/7XMlMEQPnnQ

public class MinSizeSubArraySum {
    // Time: O(n); Space: O(1)
    public static int findMinSubArray(int S, int[] arr) {
        int start = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            windowSum += arr[end];

            while (windowSum >= S) {
                minLength = Math.min(minLength, end - start + 1);
                windowSum -= arr[start++];
            }
        }
        return minLength;
    }
}
