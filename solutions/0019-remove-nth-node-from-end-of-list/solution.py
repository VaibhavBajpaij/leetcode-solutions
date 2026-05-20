# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next==None:
            return None
        

        temp=head
        len=0
        while(temp!=None):
            temp=temp.next
            len+=1
        if(len==n):
            return head.next
        gap=len-n-1
        l=0
        temp=head
        while(l<gap):
            temp=temp.next
            l+=1
        if(n==1):
            temp.next=None
        else:
            temp.next=temp.next.next
        return head

        
        
