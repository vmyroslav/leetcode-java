package leetcode.Medium._173;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BSTIteratorTest {

    private BFSBSTIterator bfsbstIterator;
    private DFSBSTIterator dfsbstIterator;

    @BeforeEach
    void setUp() {
        TreeNode root = new TreeNode(
                7,
                new TreeNode(3),
                new TreeNode(15, new TreeNode(9), new TreeNode(20))
        );
        bfsbstIterator = new BFSBSTIterator(root);
        dfsbstIterator = new DFSBSTIterator(root);
    }

    @Test
    void next() {
        assertEquals(3, bfsbstIterator.next());
        assertEquals(3, dfsbstIterator.next());
        assertEquals(7, bfsbstIterator.next());
        assertEquals(7, dfsbstIterator.next());
        assertEquals(9, bfsbstIterator.next());
        assertEquals(9, dfsbstIterator.next());
    }

    @Test
    void hasNext() {
        assertTrue(bfsbstIterator.hasNext());
        assertTrue(dfsbstIterator.hasNext());
    }
}