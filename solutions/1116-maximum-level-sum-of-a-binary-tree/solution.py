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
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:

        l=self.levelorder(root)

        s=-sys.maxsize
        ans=0


        for i in range(len(l)):
            v=sum(l[i])
            if(v>s):
                ans=i+1
                s=sum(l[i])

        return ans
        
