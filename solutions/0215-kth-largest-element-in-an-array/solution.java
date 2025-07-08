class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> he = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            he.add(nums[i]);
            if(he.size()>k) he.remove();

        }

        return he.peek();

    }
}
