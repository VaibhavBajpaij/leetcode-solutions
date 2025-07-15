class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];

            while(sum>=target){
                min=Math.min(min,i-start+1);
                sum=sum-nums[start];
                start++;
            }
           
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}
