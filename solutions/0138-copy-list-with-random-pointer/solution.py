"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':

        if head is None:
            return None

        # Create first node
        dummy = Node(head.val)

        tempold = head.next
        tempnew = dummy

        # Map old node -> new node
        mp = {}
        mp[head] = dummy

        # Create copied linked list
        while tempold is not None:

            node = Node(tempold.val)

            tempnew.next = node

            tempnew = tempnew.next
            mp[tempold] = tempnew

            tempold = tempold.next

        # Assign random pointers
        tempold = head
        tempnew = dummy

        while tempold is not None:

            if tempold.random is not None:
                tempnew.random = mp[tempold.random]
            else:
                tempnew.random = None

            tempold = tempold.next
            tempnew = tempnew.next

        return dummy
