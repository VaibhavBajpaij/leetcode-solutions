class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0;
        fre={}
        sum=0;
        for i in range(0,len(nums)):
            sum+=nums[i]
            if(sum==k):
                count+=1
            if sum-k in fre:
                count+=fre[sum-k]
            fre[sum]=fre.get(sum,0)+1
        return count

            

        
                    
        return count

