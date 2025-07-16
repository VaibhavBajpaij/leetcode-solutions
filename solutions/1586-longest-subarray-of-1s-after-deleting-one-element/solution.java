class Solution {
    public int longestSubarray(int[] nums) {
        int min=0;
        int c=0;
        int n= nums.length;
        int i=0;
        int j=0;
        for( j=0;j<n;j++){
            if(nums[j]==0) c+=1;
            while (c > 1) {
                if (nums[i] == 0) c--;
                i++;
            }

            min = Math.max(min, j - i);
            
        }
     
        return min;

        
    }
}
