# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def length1(self,head):
        curr=head
        len=0
        while curr:
            len+=1
            curr=curr.next
        return len
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        """
        lenA=self.length1(headA)
        lenB=self.length1(headB)
        curA=headA
        curB=headB

        if lenA<lenB:
            
            deff=lenB-lenA
            for i in range(deff):
                curB=curB.next
            while curB and curA:
                if(curB==curA):
                    return curB
                curB=curB.next
                curA=curA.next
        else:
            deff=lenA-lenB
            for i in range(deff):
                curA=curA.next
            while curB and curA:
                if(curB==curA):
                    return curB
                curB=curB.next
                curA=curA.next



        
