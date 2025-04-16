// Corrected two-pointer solution for rearranging array with alternating signs
// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int i = 0;

//         while (i < n) {
//             // For even index, expect positive number
//             if (i % 2 == 0 && nums[i] < 0) {
//                 int j = i + 1;
//                 // Find the next positive number to swap
//                 while (j < n && nums[j] < 0) {
//                     j++;
//                 }
//                 if (j < n) {
//                     // Shift elements between i and j to right by 1
//                     int temp = nums[j];
//                     for (int k = j; k > i; k--) {
//                         nums[k] = nums[k - 1];
//                     }
//                     nums[i] = temp;
//                 }
//             }

//             // For odd index, expect negative number
//             else if (i % 2 == 1 && nums[i] >= 0) {
//                 int j = i + 1;
//                 // Find the next negative number to swap
//                 while (j < n && nums[j] >= 0) {
//                     j++;
//                 }
//                 if (j < n) {
//                     // Shift elements between i and j to right by 1
//                     int temp = nums[j];
//                     for (int k = j; k > i; k--) {
//                         nums[k] = nums[k - 1];
//                     }
//                     nums[i] = temp;
//                 }
//             }

//             i++; // Move to the next index
//         }

//         return nums;
//     }
// }
// Java solution to rearrange array so that positives and negatives alternate
// Time Complexity: O(n), Space Complexity: O(n)

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n];
        int[] neg = new int[n];
        int p = 0, q = 0;

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num >= 0)
                pos[p++] = num;
            else
                neg[q++] = num;
        }

        // Rebuild the array with alternating signs
        int[] result = new int[n];
        int i = 0, x = 0, y = 0;

        while (i < n) {
            if (x < p) result[i++] = pos[x++];
            if (i < n && y < q) result[i++] = neg[y++];
        }

        return result;
    }
}

