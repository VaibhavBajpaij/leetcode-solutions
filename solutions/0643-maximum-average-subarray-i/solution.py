class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        ans=0

        l=len(nums)
        total=0
        for i in range(0,k):
            total+=nums[i]
        ans=total
        for i in range(k,l):
            total=total-nums[i-k]+nums[i]
            ans=max(total,ans)
        
        return ans/k



        
