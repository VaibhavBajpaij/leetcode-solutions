"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def level(self,root,l):
        if(root==None):
            return 

        q=deque([root])
        l.append([root])

        while(q):
            level=[]

            for i in range(len(q)):
                node=q.popleft()

                if(node.left):
                    q.append(node.left)
                    level.append(node.left)
                if(node.right):
                    q.append(node.right)
                    level.append(node.right)
            l.append(level)
    def connect(self, root: 'Optional[Node]') -> 'Optional[Node]':
        l=[]
        self.level(root,l)
        for i in range(len(l)):
            for j in range(len(l[i])):
                if(l[i][j]==l[i][-1]):
                    l[i][j].next=None
                else:
                    l[i][j].next=l[i][j+1]
        return root
        
