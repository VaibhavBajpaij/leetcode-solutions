from typing import List

class Solution:
    def maxSubarraySumCircular(self, nums: List[int]) -> int:
        total = nums[0]
        
        maxSum = nums[0]
        curMax = nums[0]
        
        minSum = nums[0]
        curMin = nums[0]
        
        for n in nums[1:]:
            curMax = max(n, curMax + n)
            maxSum = max(maxSum, curMax)
            
            curMin = min(n, curMin + n)
            minSum = min(minSum, curMin)
            
            total += n
        
        # ⚠️ All numbers negative case
        if maxSum < 0:
            return maxSum
        
        return max(maxSum, total - minSum)
