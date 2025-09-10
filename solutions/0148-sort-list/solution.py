# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        if not head:
            return head
        curr=head
        l=[]
        while curr:
            l.append(curr.val)
            curr=curr.next
        l.sort()
        node=ListNode(l[0])
        nodehead=node
        for val in l[1:]:
            node.next=ListNode(val)
            node=node.next
        return nodehead
        
        
