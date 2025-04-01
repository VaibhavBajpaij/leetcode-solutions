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
    public ListNode middleNode(ListNode head) {


        // this is very importent of interview perpose

        // this is don by 2 pass solution which is not good we will sovle it with
        // sapce complexity is O(1) and time complexity is O(n)
        // it is 2 pass solution in which we run loop to time

    //     ListNode temp=head;
    //     int len=0;
    //     while( temp!=null){
    //         temp=temp.next;
    //         len++;
    //     }
    //     temp=head;
    //     int mid=(len/2)+1;
    //     for(int i=1;i<=mid-1;i++){
    //         temp=temp.next;
    //     }
    //     return temp;



    // this is the slow fast approch 

    ListNode slow=head;
    ListNode fast=head;


    // while(fast.next!=null && fast!=null){
    //     slow=slow.next;
    //     fast=fast.next.next;
    // }
    // if I cause the above code than it will throught error becuse fast.next!=null where null.next throught error


    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;








        
    }
}
