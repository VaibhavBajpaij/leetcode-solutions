# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def height(self,root,b):
        if(root==None):
            return 0

        left=self.height(root.left,b)
        right=self.height(root.right,b)
        a=abs(left-right)
        if(a>1):
            b[0]=1
            return 0

        return 1+max(left,right)
        
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        b=[0]
        self.height(root,b)
        if(b[0]==1):
            return False
        else:
            return True
        
