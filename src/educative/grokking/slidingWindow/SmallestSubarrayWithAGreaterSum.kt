package educative.grokking.slidingWindow

import kotlin.math.max
import kotlin.math.min

/**
 * Input: [2, 1, 5, 2, 3, 2], S=7
   Output: 2
   Explanation: The smallest subarray with a sum greater than or equal to ‘7’ is [5, 2].
 */
class SmallestSubarrayWithAGreaterSum {

    // O(N)
    fun findMinSubArray(s: Int, arr: Array<Int>): Int {
        var start = 0
        var sum = 0
        var min = Integer.MAX_VALUE

        for (i in arr.indices) {
            sum += arr[i]
            while (sum >= s) {
                min = min(min, i - start + 1)
                sum -= arr[start++]
            }
        }

        return if (min == Integer.MAX_VALUE) 0 else min
    }
}