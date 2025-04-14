class Solution {

    // Static variable to count recursive calls (optional)
    public static int count = 0;

    // Helper method to collect nodes at a particular level with zigzag order
    private void helper(TreeNode root, int level, int curr, List<Integer> ans) {
        // Base condition
        if (root == null) return;

        // If we're at the desired level, add the node's value
        if (level == curr) {
            ans.add(root.val);
        }

        // Decide traversal order based on current level parity
        //if (count % 2 == 0) {
            // Even level: left to right
            helper(root.left, level, curr + 1, ans);
            helper(root.right, level, curr + 1, ans);
        // } else {
        //     // Odd level: right to left
        //     helper(root.right, level, curr + 1, ans);
        //     helper(root.left, level, curr + 1, ans);
        // }

        // Increment call count (optional)
        count++;
    }

    // Method to calculate the depth/height of the tree
    private int level(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    // Main method to return the zigzag level order traversal
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Final answer list
        List<List<Integer>> ans = new ArrayList<>();

        // Get the total number of levels in the tree
        int lev = level(root);

        // Traverse level by level
        for (int i = 0; i < lev; i++) {
            List<Integer> list = new ArrayList<>();
            helper(root, i, 0, list); // Get all nodes at level i
             if (i % 2 == 1) {
                Collections.reverse(list);
             }

            ans.add(list);
        }

        return ans;
    }
}
