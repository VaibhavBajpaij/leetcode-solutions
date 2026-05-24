# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def widthOfBinaryTree(self, root: Optional[TreeNode]) -> int:

        q=deque([(root,0)])
        maxwidth=0
        while q:
            
            left= q[0][1]
            right=q[-1][1]
            maxwidth=max(maxwidth,right-left+1)

            l=len(q)
            for i in range(l):
                key,v=q.popleft()
                
                if key.left:
                    q.append((key.left,2*v+1))
                
                if key.right:
                    q.append((key.right,2*v+2))
        return maxwidth





        
