package educative.grokking.reversalLinkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverseLinkedListTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void reverse() {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        ListNode result = ReverseLinkedList.reverse(head);
        assertEquals(head, ReverseLinkedList.reverse(result));

        assertTrue(true);
    }
}