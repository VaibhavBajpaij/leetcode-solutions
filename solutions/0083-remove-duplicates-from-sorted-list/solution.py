# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if(head==None): return head
        temp=head
        head1=temp
        temp1=temp.next
        while(temp1!=None):
            if(temp.val==temp1.val):
                temp1=temp1.next
            else:
                temp.next=temp1
                temp=temp.next
                temp1=temp1.next
        temp.next=temp1
        return head1
        
