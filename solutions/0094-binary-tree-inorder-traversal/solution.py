# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorder(self,root,list):
        if(root==None):
            return 
        
        self.inorder(root.left,list)
        list.append(root.val)
        self.inorder(root.right,list)
        

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        l=[]
        self.inorder(root,l)
        return l
       
        
        
