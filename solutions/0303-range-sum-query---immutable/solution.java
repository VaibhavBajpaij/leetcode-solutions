class NumArray {
    private int[] nums;

   
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    
    public int sumRange(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            ans += nums[i];
        }
        return ans;
    }
}

