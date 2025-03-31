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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int [] arr={-1,-1};
        if(head==null || head.next==null || head.next.next==null) return arr;
        ListNode p=head;
        ListNode c=head.next;
        ListNode r=head.next.next;
        int first=-1;
        int last=-1;
        int min= Integer.MAX_VALUE; 
        int idx=1;
        
        while(r!=null){
            if(p.val>c.val && r.val>c.val || p.val<c.val && r.val<c.val){
                if(first==-1) first=idx;
                if(last!=-1){
                    int diff=idx-last;
                    min=Math.min(diff,min);
                    
                   
                }
                last=idx;
               
            }

             p=p.next;
                c=c.next;
                r=r.next;
                idx++;
                 
        }
        if(first==last) return arr;
        arr[1]=last-first;
        arr[0]=min;
        return arr;

        
    }
}
