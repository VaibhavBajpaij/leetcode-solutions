class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        lp=[]
        ln=[]
        for val in nums:
            if val>0:
                lp.append(val)
            else:
                ln.append(val)
        n=len(nums)
        ip=0
        idn=0
        for i in range(n):
            if(i%2==0):
                nums[i]=lp[ip]
                ip+=1
            else:
                nums[i]=ln[idn]
                idn+=1 
        return nums
        
