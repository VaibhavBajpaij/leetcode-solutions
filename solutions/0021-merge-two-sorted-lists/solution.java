/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Creating a dummy node to store the merged list
        ListNode dummy = new ListNode(-1); 
        ListNode temp = dummy; // Pointer to traverse the new list

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        // Append the remaining elements of list1 or list2
        if (temp1 != null) temp.next = temp1;
        if (temp2 != null) temp.next = temp2;

        return dummy.next; // Return the merged list (excluding dummy node)
    }
}

