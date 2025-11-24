# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if not head or left == right:
            return head
        dummy =  ListNode(0)
        dummy.next=head
        curr=head
        leftprev=dummy
        for i in range(left-1):
            curr=curr.next
            leftprev=leftprev.next
        
       

        sublisthead=curr
        x=right-left+1
        prev=None
        for i in range(x):
            nextstep=curr.next
            curr.next=prev
            prev=curr
            curr=nextstep
        leftprev.next=prev
        sublisthead.next=curr
        
        return dummy.next



        
