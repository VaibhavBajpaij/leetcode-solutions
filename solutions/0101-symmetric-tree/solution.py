class Solution:
    def issym(self, p, q):
        if not p and not q:
            return True
        if not p or not q:
            return False
        if p.val != q.val:
            return False
        
        # Compare mirror children:
        return self.issym(p.left, q.right) and self.issym(p.right, q.left)

    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.issym(root.left, root.right) if root else True

