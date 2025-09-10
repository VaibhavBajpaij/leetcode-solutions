# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        len=0
        a=head
        while a:
            a=a.next
            len+=1
        if n==len:
           head=head.next
           return head
        ol=len-n-1
        curr=head
        for i in range(ol+1):
            if i==ol:
                break
            curr=curr.next
        
        curr.next=curr.next.next
        return head

        
