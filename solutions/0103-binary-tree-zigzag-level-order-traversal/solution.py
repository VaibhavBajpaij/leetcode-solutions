# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if(root==None):
            return []

        ans=[[root.val]]

        q=deque([root])
        flag=1

        while(q):

            l=len(q)

            level=[]
            for i in range(l):
                node=q.popleft()

                if(node.left):
                    q.append(node.left)
                    level.append(node.left.val)
                if(node.right):
                    q.append(node.right)
                    level.append(node.right.val)
            if(flag==0):
                ans.append(level)
                flag=1
            else:
                ans.append(level[::-1])
                flag=0
        return ans[:-1]
        
