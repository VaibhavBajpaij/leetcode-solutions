# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return head
        i=None
        j=head
        k=head


        while(j!=None):
            k=j.next
            j.next=i
            i=j
            j=k
            
        return i
        
