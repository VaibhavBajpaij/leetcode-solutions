class Solution {
    private static void roto(int [] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len =nums.length;
        k=k%len;
        if(k==0) return ;
        if(len<1) return ;
        roto(nums,0,len-1);
        roto(nums,0,k-1);
        roto(nums,k,len-1);

        return ;     
    }
}
