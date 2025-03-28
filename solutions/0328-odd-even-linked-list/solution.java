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
    public ListNode oddEvenList(ListNode head) {
        ListNode a=new ListNode(-1);
        ListNode b=new ListNode(-1);
        ListNode lista=a;
        ListNode listb=b;
        ListNode temp=head;
        int count=1;

        while(temp!=null){

            if(count%2==1){
                lista.next=temp;
                lista=lista.next;

            }else{
                listb.next=temp;
                listb=listb.next;
            }
            temp=temp.next;
            count++;

        }
        listb.next=null;
        a=a.next;
        b=b.next;
        if(lista==null) return listb;
        lista.next=b;
        return a;





        
    }
}
