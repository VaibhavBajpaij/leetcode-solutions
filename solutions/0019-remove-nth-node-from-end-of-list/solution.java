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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // First approce which is note so good we will do it by slow fast approch
        
        
    //     ListNode temp=head;
    //     int len=0;
    //     while(temp!=null){
    //         temp=temp.next;
    //         len++;

    //     }
    //     // if n=head than we need to delete head
    //     if(n==len){
    //         head=head.next;
    //         return head;
    //     }
    //     temp=head;
    //     // n element from the last is len-n+1 from start
    //     // we to remove len-n
        
        

    //     for(int i=1;i<=len-n-1;i++){
    //         temp=temp.next;
    //     }
    //     temp.next=temp.next.next;
    //     return head;

    // By Slow fast approch 
    
    // Step 1: Initialize slow and fast pointers at head
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; // To track the node before the one to be removed

        // Step 2: Move the fast pointer 'n' steps ahead
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        // Step 3: Move both slow and fast pointers until fast reaches the end
        // This ensures that slow points to the nth node from the end
        while (fast != null) {
            prev = slow;      // Track the previous node of slow
            slow = slow.next; // Move slow one step
            fast = fast.next; // Move fast one step
        }

        // Step 4: If n equals the total length of the list, remove the head
        if (prev == null) {
            head = head.next;
            return head;
        }

        // Step 5: Remove the nth node from the end
        prev.next = slow.next;

        // Step 6: Return the modified list
        return head;


     }
}
