class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        
        ans=[]
        for i in range(len(nums)):
            ans.append(nums[i])
        for val in nums:
            ans.append(val)
        return ans
        
