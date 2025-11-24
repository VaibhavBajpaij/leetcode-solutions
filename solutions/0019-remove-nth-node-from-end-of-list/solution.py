# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        temp=head
        length=0
        while(temp!=None):
            temp=temp.next
            length+=1
        if(length==1):
            return None
        if(length==n):
            return head.next
        
        
        
        
        x=length-n
        temp=head
        for i in range(x-1):
            temp=temp.next
        
        temp.next=temp.next.next
        return head

            
        
