class Solution {

    // ✅ FIX 1: Renamed 'revesvers' → 'reverse' for clarity
    private void reverse(int[] nums, int i) {
        int n = nums.length - 1;

        while (i < n) {
            int temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            i++;
            n--;
        }
    }

    // ✅ FIX 2: Renamed 'findi' → 'findPivot' for clarity
    // ✅ FIX 3: Return 'i - 1' instead of 'i' to get correct pivot index
    private int findPivot(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                return i - 1; // FIXED: Should return i-1 (pivot index)
            }
        }
        return -1; // No pivot found
    }

    public void nextPermutation(int[] nums) {
        int index = findPivot(nums); // ✅ Uses fixed findPivot()

        if (index == -1) {
            // ✅ FIX 4: Reverse from index 0 when no next permutation
            reverse(nums, 0); // FIXED: Used corrected reverse()
        } else {
            int small = -1; // ✅ FIX 5: Use -1 instead of 0 for safety

            // ✅ FIX 6: Loop condition 'i > index' (you had 'i < index' which never runs)
            for (int i = nums.length - 1; i > index; i--) { // FIXED
                if (nums[i] > nums[index]) {
                    small = i;
                    break;
                }
            }

            // Swap pivot with next greater element
            int temp = nums[index];
            nums[index] = nums[small];
            nums[small] = temp;

            // ✅ FIX 7: Reverse from index + 1 (you had index)
            reverse(nums, index + 1); // FIXED: must reverse the suffix after pivot
        }
    }
}

