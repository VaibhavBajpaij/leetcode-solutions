# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,head):
        curr=head
        prev=None

        while(curr!=None):
            right=curr.next
            curr.next=prev
            prev=curr
            curr=right
        return prev
        
    def rotateRight(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        if head is None or head.next is None:
            return head
        

        #length
        len=0
        temp=head
        while(temp!=None):
            temp=temp.next
            len+=1
        a=0
        if k>len:
            k=k%len
        a=k
        if(a==0):
            return head

        head1=self.reverse(head)
        temp=head1
        
        prev=head1
        l=0
        while(l<a-1):
            prev=prev.next
            l+=1
        h2=prev.next
        prev.next=None
        h1=head1
        ans=self.reverse(h1)
        tail=self.reverse(h2)
        head1.next=tail
        return ans





            

        
