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
    
    ListNode slow=head;
    ListNode fast=head;
    ListNode prev=null;
    int len=n;
    for(int i=1;i<=n;i++){
        fast=fast.next;
    }
    while(fast!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next;
        len++;


    }
    if(n==len){
        head=head.next;
        return head;
    }
    prev.next=slow.next;
    return head;




     }
}
