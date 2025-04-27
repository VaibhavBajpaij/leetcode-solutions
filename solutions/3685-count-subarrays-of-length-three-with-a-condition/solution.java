class Solution {
    public int countSubarrays(int[] nums) {
        if (nums.length<3) return 0;
        int count=0;
       for(int i=2;i<nums.length;i++){
        int prev=i-2;
        int curr=i-1;
        int sum=nums[prev]+nums[i];
        if(sum*2==nums[curr]){
            count++;
        }

       }
       return count;
    }
}
