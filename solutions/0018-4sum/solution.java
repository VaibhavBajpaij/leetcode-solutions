class Solution {
     public List<List<Integer>> fourSum(int[] nums, int target) {
    // List<List<Integer>> ans = new ArrayList<>();
    // int n = nums.length;
    // Arrays.sort(nums); // ✅ Optional but helps remove duplicates and maintain order

    // for (int i = 0; i < n; i++) {
    //     for (int j = i + 1; j < n; j++) {
    //         HashSet<Integer> set = new HashSet<>(); // ✅ Fix 1: Move set inside (i,j) loop
    //         for (int k = j + 1; k < n; k++) {
    //             int sum = nums[i] + nums[j] + nums[k];
    //             int def = target - sum;

    //             if (set.contains(def)) {
    //                 List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], def);
    //                 Collections.sort(quad); // ✅ Fix 2: Sort to maintain consistency
    //                 if (!ans.contains(quad)) { // ✅ Fix 3: Avoid duplicates
    //                     ans.add(quad);
    //                 }
    //             }
    //             set.add(nums[k]); // ✅ Fix 4: Add before checking
    //         }
    //     }
    // }
    // return ans;


    // Most Optimized Solution

     List<List<Integer>> ans=new ArrayList<>();
   Arrays.sort(nums);
     int n=nums.length;
       
      for (int i = 0; i < n; i++) {
            // ✅ Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n; j++) {
                // ✅ Skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int p = j + 1;
                int q = n - 1;

                while (p < q) {
                    long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];

                    if (sum == target) {
                        // ✅ Found a valid quadruplet
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;

                        // ✅ Skip duplicates for p and q
                        while (p < q && nums[p] == nums[p - 1]) p++;
                        while (p < q && nums[q] == nums[q + 1]) q--;

                    } else if (sum < target) {
                        p++;
                    } else {
                        q--;
                    }
                }
            }
        }

        return ans;
    }
}
