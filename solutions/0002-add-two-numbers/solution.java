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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode list1=l1;
        ListNode list2=l2;
        int carry=0;
        while(list1!=null || list2!=null){
            int val1=0;
            int val2=0;
            
            if(list1!=null)  val1=list1.val;
            if(list2!=null) val2=list2.val;
            int num=val1+val2+carry;
            ListNode node =new ListNode(num%10);
            temp.next=node;
            temp=temp.next;
            if(list1!=null) list1=list1.next;
            if(list2!=null) list2=list2.next;
            carry = num / 10; 

        }
        if(carry==1){
            ListNode node =new ListNode(1);
            temp.next=node;
            temp=temp.next;
        }

        return dummy.next;

        
    }
}
