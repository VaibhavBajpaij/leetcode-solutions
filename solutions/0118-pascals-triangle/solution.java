// Pascal's Triangle Generator
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int value = 1; // First value in each row is always 1

            // Loop to calculate each element in the current row
            for (int j = 0; j <= i; j++) {
                row.add(value); // Add the current value to the row

                // Update value using binomial coefficient relation:
                // C(i, j+1) = C(i, j) * (i - j) / (j + 1)
                value = value * (i - j) / (j + 1);
            }

            // Add the completed row to the result
            ans.add(row);
        }

        return ans;
    }
}

