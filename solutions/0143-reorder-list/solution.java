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
    private ListNode mergeList(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode temp=dummy;
        int count=1;
        while(temp1!=null && temp2!=null){
            if(count%2==1){
                temp.next=temp1;
                temp1=temp1.next;
            } else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
            count++;

        }
        if(temp1!=null) temp.next=temp1;
        if(temp2!=null) temp.next=temp2;
        return dummy.next;

    }
    private ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode a=head;
        ListNode prev=null;
        while(curr!=null){
            a=curr.next;
            curr.next=prev;
            prev=curr;
            curr=a;
        }
        return prev;
    }
    public void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newNode=slow.next;
        slow.next=null;
        ListNode newhead=reverse(newNode);
        ListNode temp1=head;
        ListNode temp2=newhead;
        mergeList(temp1,temp2);
        

        

        
    }
}
