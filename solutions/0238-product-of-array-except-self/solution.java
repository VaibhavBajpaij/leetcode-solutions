class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] infex =new int[nums.length];
        int [] prefex =new int[nums.length];
        int n=nums.length;
        int inf=1;
        int p=1;
        for(int i=0 ;i<nums.length ;i++ ){
            inf*=nums[i];
            p*=nums[n-1-i];
            infex[i]=inf;
            prefex[n-1-i]=p;

        }
        int [] ans=new int[n];
        ans[0]=prefex[1];
        ans[n-1]=infex[n-1-1];
        for (int i=1;i<n-1;i++){
            ans[i]=infex[i-1]*prefex[i+1];
        }
        return ans;
        
    }
}
