# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

   
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:

        self.preindex=0

        def build(left,right):

            if(left>right or self.preindex>=len(preorder)):
                return None

            root_val= preorder[self.preindex]
            self.preindex+=1

            ind=inorder.index(root_val)

            root=TreeNode(root_val)

            root.left=build(left,ind-1)
            root.right=build(ind+1,right)

            return root
        return build(0, len(inorder) - 1)


        
        
