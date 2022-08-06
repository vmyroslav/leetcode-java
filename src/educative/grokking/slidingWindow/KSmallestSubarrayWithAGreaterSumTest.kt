package educative.grokking.slidingWindow

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KSmallestSubarrayWithAGreaterSumTest {

    @Test
    fun findMinSubArray() {
        assertEquals(2, KSmallestSubarrayWithAGreaterSum().findMinSubArray(7, arrayOf(2, 1, 5, 2, 3, 2)))
        assertEquals(1, KSmallestSubarrayWithAGreaterSum().findMinSubArray(1, arrayOf(2, 1, 5, 2, 8)))
        assertEquals(3, KSmallestSubarrayWithAGreaterSum().findMinSubArray(8, arrayOf(3, 4, 1, 1, 6)))
    }
}