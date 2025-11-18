class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        n=len(nums)
        mid=n//2
        ans=[]
        for i in range(mid):
            ans.append(nums[i])
            ans.append(nums[i+mid])
        return ans
        
