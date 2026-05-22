# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelorder(self,root):
        ans=[]
        if(root==None):
            return ans
        q=deque([root])

        while q:
            level=[]
            l=len(q)
            for i in range(l):
                node=q.popleft()
                level.append(node.val)
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)

            ans.append(level)
        return ans
    def findBottomLeftValue(self, root: Optional[TreeNode]) -> int:
        l=self.levelorder(root)
        
        return l[-1][0]
        
