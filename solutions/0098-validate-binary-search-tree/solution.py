# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def valid(self,root,min,max):
        if root is None:
            return True
        if(max!=None and root.val>=max.val):
            return False
        if(min!=None and root.val<=min.val):
            return False
        left=self.valid(root.left,min,root)
        right=self.valid(root.right,root,max)
        return left and right

    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        return self.valid(root,None,None)

        

        
        
