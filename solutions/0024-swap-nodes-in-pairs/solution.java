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
    private ListNode mergeAlter(ListNode l1,ListNode l2){
        ListNode dummy =new ListNode(-1);
        ListNode temp=dummy;
        ListNode temp1=l1;
        ListNode temp2=l2;

        int count=1;
        while(temp1!=null && temp2!=null){
            if(count%2==1){
                temp.next=temp2;
                temp2=temp2.next;
                             
                                                 
                 }else{
                    temp.next=temp1;
                    temp1=temp1.next;
                 }
                 count++;
                 temp=temp.next;
        }
        if(temp1==null) temp.next=temp2;
        if(temp2==null) temp.next=temp1;
        return dummy.next;


    }
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode a= new ListNode(-1);
        ListNode b=new ListNode(-1);
        ListNode lista=a;
        ListNode listb=b;
        ListNode temp=head;
        int count=1;

       while (temp != null) {
            if (count % 2 == 1) {
                lista.next = temp;  
                lista = lista.next;
            } else {
                listb.next = temp;  
                listb = listb.next;
            }
            count++;
            temp = temp.next;
        }
        lista.next=null;
        listb.next=null;

        ListNode merge= mergeAlter(a.next,b.next);
        return merge;


        

        
    }
}
