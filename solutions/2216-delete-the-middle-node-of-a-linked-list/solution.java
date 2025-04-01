class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // If the list is empty or has only one node, return null (since the only node is the middle node)
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow and fast pointers at the head of the list
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To keep track of the node before the middle node

        // Move fast pointer twice as fast as the slow pointer
        while (fast != null && fast.next != null) {
            prev = slow;        // Store the previous node of slow
            slow = slow.next;   // Move slow pointer one step
            fast = fast.next.next; // Move fast pointer two steps
        }

        // Now slow points to the middle node, and prev points to the node before it
        // Remove the middle node by linking prev to slow's next node
        prev.next = slow.next;

        // Return the modified list
        return head;
    }
}




// Function deleteMiddle(head):
//     If head is NULL or head.next is NULL:
//         Return NULL  // Edge case: If there’s only one node, return NULL

//     slow ← head
//     fast ← head
//     prev ← NULL  // To keep track of the node before the middle

//     // Use two-pointer technique to find the middle node
//     While fast is not NULL and fast.next is not NULL:
//         prev ← slow
//         slow ← slow.next
//         fast ← fast.next.next

//     // Now slow points to the middle node, prev is the node before it
//     prev.next ← slow.next  // Remove the middle node

//     Return head  // Return the modified list

