# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if not head:
            return head

        tail = head
        n=1
        while(tail.next!=None):
            tail=tail.next
            n+=1
        k=k%n
        if(k==0):
            return head
        tail.next=head
        new_head=head
        for i in range(n-k-1):
            new_head=new_head.next
        new_tail=new_head
        new_head=new_head.next
        new_tail.next=None
        return new_head
        
