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
    // Function to calculate the length of the linked list
    private int lent(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        return n;
    }

    public ListNode[] splitListToParts(ListNode head, int k) {

        int len = lent(head); // Get the total length of the linked list
        ListNode temp = head;
        int extra = len % k;  // Extra nodes that need to be distributed among the first 'extra' parts
        int size = len / k;   // Base size of each part
        int idx = 0;          // Index for the result array
        int len1 = 1;         // Counter to track the size of the current part
        ListNode[] arr = new ListNode[k]; // Array to store the split lists
        
        while(temp != null){
            int s = size;
            if(extra > 0) s++; // Increase size for first 'extra' parts
            
            if(len1 == 1) arr[idx++] = temp; // Store the start of the new part
            
            if(len1 == s){
                ListNode a = temp;  // Save the current node
                
                temp = temp.next;   // Move temp to the next node (Fix: temp should move before breaking the link)
                a.next = null;      // Break the current part correctly (Fix: 'a.next' should be set, not 'temp.next')
                
                len1 = 1; 
                extra--;          // Reset len1 for the next part
            } else {
                len1++;  
                temp = temp.next;
            }
        }
        
        return arr;
    }
}

