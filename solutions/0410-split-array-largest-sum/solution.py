class Solution:
    def findtheK(self,nums:List[int],range:int)->int:
        sum=0
        number=1
        for val in nums:
            if(val+sum<=range):
                sum=sum+val
            else:
                sum=val
                number+=1
        return number
    def splitArray(self, nums: List[int], k: int) -> int:
        
        # leaner search 
        low=max(nums)
        high=sum(nums)

        while(low<high):
            mid=(low+high)//2
            val=self.findtheK(nums,mid);
            if(val>k):
                low=mid+1
            else:
                high=mid
        return low

