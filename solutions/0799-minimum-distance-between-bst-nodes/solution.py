# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorder(self,root,l):
        if(root==None):
            return 
        l.append(root.val)
        self.preorder(root.left,l)
        self.preorder(root.right,l)
    def minDiffInBST(self, root: Optional[TreeNode]) -> int:

        l=[]
        self.preorder(root,l)
        l.sort()
        ans=max(l)
        for i in range(len(l)-1):
            a = l[i+1]-l[i]
            ans=min(a,ans)
        return ans    


        
