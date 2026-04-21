class Solution {
    public long[] findPrefixScore(int[] nums) {
        
       int max=nums[0];
     
       long [] ans=new long[nums.length];
       ans[0]=max+nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max);
            ans[i]=nums[i]+max +ans[i-1];

        }
        return ans;
        
    }
}
