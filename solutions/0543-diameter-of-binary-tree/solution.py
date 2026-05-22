class Solution:
    def __init__(self):
        self.a = 0

    def height(self, root):
        if root == None:
            return 0

        left = self.height(root.left)
        right = self.height(root.right)

        self.a = max(self.a, left + right)

        return 1 + max(left, right)

    def diameterOfBinaryTree(self, root):
        self.height(root)
        return self.a
