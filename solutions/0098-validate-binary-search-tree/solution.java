class Solution {

    // Helper function to perform inorder traversal and store values in a list
    private void inorder(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) return;
        inorder(root.left, ans);      // Traverse left subtree
        ans.add(root.val);            // Visit current node (add value, not node)
        inorder(root.right, ans);     // Traverse right subtree
    }

    // Function to check if a binary tree is a valid BST
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);  // Fill the list with inorder traversal of tree

        // Check if the inorder list is strictly increasing
        for (int i = 1; i < ans.size(); i++) {
            if (ans.get(i) <= ans.get(i - 1)) return false;
        }
        return true;
    }
}
