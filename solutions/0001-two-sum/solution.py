class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict={}
        for i in range(len(nums)):
            t=target-nums[i]
            if(t in dict):
                return [dict[t],i]
            else:
                dict[nums[i]]=i
        retun [0,0]
