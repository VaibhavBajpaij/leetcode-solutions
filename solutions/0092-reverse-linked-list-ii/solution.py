# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        if not head or left==right:
            return head
        dummey =ListNode(0)
        dummey.next = head
        prev=dummey

        for i in range(left-1):
            prev=prev.next
        
        curr=prev.next
        last=prev
        newest=curr
        p=None


        n=right-left+1

        for i in range(n):
            r=curr.next
            curr.next=p
            p=curr
            curr=r
        last.next=p
        newest.next=curr
        return dummey.next



        

        
