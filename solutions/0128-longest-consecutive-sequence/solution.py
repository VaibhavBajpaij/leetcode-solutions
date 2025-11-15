class Solution:
    def longestConsecutive(self, arr: List[int]) -> int:
        if(len(arr)==0):
            return 0
        num=set(arr)
        nums=list(num)


        nums.sort()
        n=len(nums)
        i=0
        m=1
        count=1
        while(i<n-1):
            if(nums[i]+1!=nums[i+1]):
                count=max(count,m)
                m=1
            else:
                m+=1 
            i+=1
        count=max(count,m)
        return count 
        
