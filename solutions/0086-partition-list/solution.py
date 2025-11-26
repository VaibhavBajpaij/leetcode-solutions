# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        dammys=ListNode(0)
        dammyL=ListNode(0)
        temp1=dammys
        temp2=dammyL
        temp=head
        while(temp!=None):
            if(temp.val<x):
                temp1.next=temp
                temp1=temp1.next
            else:
                temp2.next=temp
                temp2=temp2.next
            temp=temp.next
        temp2.next=None
        temp1.next=dammyL.next
        return dammys.next
        
