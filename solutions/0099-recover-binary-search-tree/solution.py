class Solution:

    def inorder(self, root, arr):

        if root is None:
            return

        self.inorder(root.left, arr)
        arr.append(root.val)
        self.inorder(root.right, arr)

    def helper(self, root):

        arr = []

        self.inorder(root, arr)

        sorted_arr = sorted(arr)

        self.map = {}

        for i in range(len(arr)):

            if arr[i] != sorted_arr[i]:

                self.map[arr[i]] = sorted_arr[i]

    def fix(self, root):

        if root is None:
            return

        if root.val in self.map:
            root.val = self.map[root.val]

        self.fix(root.left)
        self.fix(root.right)

    def recoverTree(self, root):

        self.helper(root)

        self.fix(root)
