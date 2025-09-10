class Solution(object):
    def deleteMiddle(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # Edge cases: empty or single node
        if not head or not head.next:
            return None

        slow, fast = head, head
        prev = None

        # Move fast by 2, slow by 1
        while fast and fast.next:
            prev = slow
            slow = slow.next
            fast = fast.next.next

        # Delete the middle node (slow)
        prev.next = slow.next
        return head

