public class Solution {
    public static int longestConsecutive(int[] nums) {
        // Base case: if array is empty, return 0
        // if (nums.length == 0) return 0;

        // // Step 1: Add all elements to a HashSet for O(1) lookups
        // HashSet<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     set.add(num);
        // }

        // int longestStreak = 0;

        // // Step 2: Iterate through each number
        // for (int num : nums) {
        //     // Only check for the start of a sequence
        //     if (!set.contains(num - 1)) {
        //         int currentNum = num;
        //         int currentStreak = 1;

        //         // Step 3: Expand the streak
        //         while (set.contains(currentNum + 1)) {
        //             currentNum++;
        //             currentStreak++;
        //         }

        //         // Update the longest streak found so far
        //         longestStreak = Math.max(longestStreak, currentStreak);
        //     }
        // }

        // return longestStreak;


          // Use HashSet for O(1) lookups
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Add all numbers to the set
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        // Step 2: Traverse each number
        for (int num : set) { // \U0001f525 Important: loop over SET, not nums[]
            // Only start counting if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Expand the sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the max length found
                maxLength = Math.max(maxLength, currentStreak);
            }
        }

        return maxLength;
    

    }
}
