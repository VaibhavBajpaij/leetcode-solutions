class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans=new int[nums.length];
        for(int i=0 ; i<nums.length;i++){
            int x=nums[i];
            int l=0;
            for (int j=0;j<nums.length;j++){
                if(x>nums[j]){
                    l++;
                }
            }
            ans[i]=l;

        }
        return ans;
        
    }
}
