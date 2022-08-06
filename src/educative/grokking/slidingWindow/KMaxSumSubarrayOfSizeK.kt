package educative.grokking.slidingWindow

import kotlin.math.max

/**
 * Input: [2, 1, 5, 1, 3, 2], k=3
   Output: 9
   Explanation: Subarray with maximum sum is [5, 1, 3].
 */
class KMaxSumSubarrayOfSizeK {

    // O(N*k)
    fun findMaxSumSubArrayBruteforce(arr: Array<Int>, k: Int): Int {
        var max = 0
        var sum = 0

        for (i  in 0..arr.size - k) {
            sum = 0
            for (a in i until i + k) {
                sum += arr[a]
            }
            max = max(max, sum)
        }

        return max
    }

    // O(N)
    fun findMaxSumSubArraySlidingWindow(arr: Array<Int>, k: Int): Int {
        var max = 0
        var sum = 0
        var start = 0

        for (i in arr.indices) {
            sum += arr[i]
            max = max(max, sum)
            if (i >= k - 1) {
                sum -= arr[start++]
            }
        }

        return max
    }
}