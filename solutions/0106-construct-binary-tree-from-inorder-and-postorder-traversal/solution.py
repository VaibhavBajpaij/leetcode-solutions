# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, inorder: List[int], postorder: List[int]) -> Optional[TreeNode]:
        self.preindex=len(postorder)-1
        inorder_map = {val: i for i, val in enumerate(inorder)}


        def build(left,right):

            if(left>right or self.preindex<0):
                return None

            root_val= postorder[self.preindex]
            self.preindex-=1

            ind=inorder_map[root_val]

            root=TreeNode(root_val)
            
            root.right=build(ind+1,right)
            root.left=build(left,ind-1)
            

            return root
        return build(0, len(inorder) - 1)

        
