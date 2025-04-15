class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
         int c=0;
        for(int i=0;i<nums.length;i++){
           
            if(nums[i]==1){
                c++;
            }else{
                count=Math.max(c,count);
                c=0;
            }
        }
        count=Math.max(c,count);
        return count;
    }
}
