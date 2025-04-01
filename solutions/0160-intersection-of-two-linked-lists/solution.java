/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Step 1: Initialize two temporary pointers for both linked lists
        ListNode tempA = headA;
        ListNode tempB = headB;

        // Step 2: Find the length of List A
        int lenA = 0;
        while (tempA != null) {
            lenA++;          // Increment length counter
            tempA = tempA.next; // Move to next node
        }

        // Step 3: Find the length of List B
        int lenB = 0;
        while (tempB != null) {
            lenB++;          // Increment length counter
            tempB = tempB.next; // Move to next node
        }

        // Reset pointers to the head of respective lists
        tempA = headA;
        tempB = headB;

        // Step 4: Align the starting point of both lists to the same distance from the end
        if (lenA > lenB) {
            // If List A is longer, move its pointer forward
            for (int i = 0; i < lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else {
            // If List B is longer, move its pointer forward
            for (int i = 0; i < lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }

        // Step 5: Traverse both lists together until we find the intersection node
        while (tempA != tempB) {
            tempA = tempA.next; // Move both pointers forward
            tempB = tempB.next;
        }

        // Step 6: Return the intersection node (or null if no intersection)
        return tempA;
    }
}

