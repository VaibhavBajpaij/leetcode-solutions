# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if(head is None):
            return head
        
        ct=0
        temp=head
        while(ct<k):
            if(temp is None):
                return head
            temp=temp.next
            ct+=1
        
        prev=self.reverseKGroup(temp,k)

        temp=head
        ct=0
        while(ct<k):
            r=temp.next
            temp.next=prev
            prev=temp
            temp=r
            ct+=1
        return prev

            
