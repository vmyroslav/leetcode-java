package educative.grokking.slidingWindow

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KMaxFruitCountOf2TypesTest {

    @Test
    fun findLength() {
        assertEquals(3, KMaxFruitCountOf2Types().findLength(arrayOf('A', 'B', 'C', 'A', 'C')))
        assertEquals(5, KMaxFruitCountOf2Types().findLength(arrayOf('A', 'B', 'C', 'B', 'B', 'C')))
    }
}