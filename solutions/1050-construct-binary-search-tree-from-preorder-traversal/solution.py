# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def build (self,preorder,inorder,preidx,left,right):
        root=TreeNode(preorder[preindex])
        preidx+=1


    def bstFromPreorder(self, preorder: List[int]) -> Optional[TreeNode]:
        if( not preorder):
            return None
        inorder=preorder.copy()
        inorder.sort()
        preidx=[0]
        mp = {value:index for index,value in enumerate(inorder)}
        
    
        
        def build (left,right):
            if(left>right):
                return None
            root=TreeNode(preorder[preidx[0]])
            id=mp[preorder[preidx[0]]]
            preidx[0]+=1
            
            root.left=build(left,id-1)
            root.right=build(id+1,right)
            return root
        return build(0,len(preorder)-1)

