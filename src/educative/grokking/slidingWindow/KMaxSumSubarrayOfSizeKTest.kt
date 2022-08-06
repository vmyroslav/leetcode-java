package educative.grokking.slidingWindow

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KMaxSumSubarrayOfSizeKTest {

    @Test
    fun findMaxSumSubArray() {
        assertEquals(7, KMaxSumSubarrayOfSizeK().findMaxSumSubArraySlidingWindow(arrayOf(2, 3, 4, 1, 5), 2))
        assertEquals(9, KMaxSumSubarrayOfSizeK().findMaxSumSubArraySlidingWindow(arrayOf(2, 1, 5, 1, 3, 2), 3))

        assertEquals(7, KMaxSumSubarrayOfSizeK().findMaxSumSubArrayBruteforce(arrayOf(2, 3, 4, 1, 5), 2))
        assertEquals(9, KMaxSumSubarrayOfSizeK().findMaxSumSubArrayBruteforce(arrayOf(2, 1, 5, 1, 3, 2), 3))
    }
}