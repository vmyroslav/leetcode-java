package leetcode.easy._21

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


internal class SolutionTest {

    private val kSolution = KSolution()
    private val kIterativeSolution = KIterativeSolution()

    @Test
    fun mergeTwoLists() {
        val l1 = KListNode(1)
        val l2 = KListNode(1)

        val result = kSolution.mergeTwoLists(l1, l2)
        val iterativeResult = kIterativeSolution.mergeTwoLists(l1, l2)

        assertEquals(result, iterativeResult)
    }
}