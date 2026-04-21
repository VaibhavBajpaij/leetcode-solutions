class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int [] prefix_sum=new int[nums.length];
        prefix_sum[0]=nums[0];
        for(int i=1 ;i<nums.length;i++){
            prefix_sum[i]=prefix_sum[i-1]+nums[i];
            
        }
        int [] ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int n=queries[i];
            int j=0;
            while( j<nums.length && prefix_sum[j]<=n){
                j++;
            }
            ans[i]=j;

        }
        return ans;
        
    }
}
