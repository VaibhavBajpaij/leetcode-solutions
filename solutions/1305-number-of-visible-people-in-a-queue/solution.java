class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length]; // Fixed: should be same size as input
        Stack<Integer> st = new Stack<>();
        int n = heights.length;

        for (int i = n - 1; i >= 0; i--) {
            int count = 0;

            // Go through stack and count visible people
            while (!st.empty() && st.peek() < heights[i]) {
                count++;
                st.pop();
            }

            // If there is still someone in stack, that person is taller or equal and visible
            if (!st.empty()) {
                count++;
            }

            ans[i] = count;
            st.push(heights[i]); // Push current person to stack
        }

        return ans;
    }
}

