

class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
   ListNode next;

    while (current != null) {
        next = current.next; // Store the next node
        current.next = prev; // Reverse the link

        // Move prev and current pointers one step ahead
        prev = current;
        current = next;
    }

    // At the end, 'prev' will be the new head of the reversed linked list
    return prev;
}
}
