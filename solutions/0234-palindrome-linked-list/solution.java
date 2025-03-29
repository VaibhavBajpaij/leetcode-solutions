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
    public boolean isPalindrome(ListNode head) {
        
        ListNode temp = head;
        int len = 0; 
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int mid = (len + 1) / 2;
        ListNode midNode = head;

        
        for (int i = 1; i < mid; i++) { 
            midNode = midNode.next;
        }

        
        ListNode mid1 = midNode.next;
        ListNode curr = midNode.next;
        ListNode prev = null;
        ListNode a;

        
        while (curr != null) {
            a = curr.next;
            curr.next = prev;
            prev = curr;
            curr = a;
        }
        midNode.next = prev; 

       
        temp = head;
        mid1 = prev; 

        for (int i = 1; i <= len / 2; i++) { 
            if (mid1.val != temp.val) {
                return false;
            }
            mid1 = mid1.next;
            temp = temp.next; 
        }
        
        return true;
    }
}

