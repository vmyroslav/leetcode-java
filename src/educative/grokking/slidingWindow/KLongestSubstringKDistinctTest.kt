package educative.grokking.slidingWindow

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KLongestSubstringKDistinctTest {

    @Test
    fun findLength() {
        assertEquals(4, KLongestSubstringKDistinct().findLength("araaci", 2))
        assertEquals(2, KLongestSubstringKDistinct().findLength("araaci", 1))
        assertEquals(5, KLongestSubstringKDistinct().findLength("cbbebi", 3))
        assertEquals(6, KLongestSubstringKDistinct().findLength("cbbebi", 10))
    }
}