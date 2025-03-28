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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dummy1=new ListNode(-1);

        ListNode dummy2=new ListNode(-1);

        ListNode list1=dummy1;
        ListNode list2=dummy2;

        ListNode temp=head;

        while(temp!=null){
            if(temp.val<x){
                list1.next=temp;
                list1=list1.next;
               
            }else{
                list2.next=temp;
                list2=list2.next;
            }
             temp=temp.next;
        }
       list2.next=null;
       
       dummy1=dummy1.next;
       dummy2=dummy2.next;
       if(dummy1==null) return dummy2;
       list1.next=dummy2;
        return dummy1;
        
    }
}
