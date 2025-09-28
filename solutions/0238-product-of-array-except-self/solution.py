class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        p=1
        a=1
        ans=[]
        c=0
        for val in nums:
            p=p*val
            if(val==0):
                c+=1
        if(c>1):
            for i in range(len(nums)):
                ans.append(0)
            return ans
        if(p==0):
            f=False
            for val in nums:
                if(val!=0):
                    a=a*val
                    f=True
            if(f):
                for val in nums:
                    if(val!=0):
                        ans.append(0)
                    else:
                        ans.append(a)
            else:
                return nums
        else:
            for val in nums:
                ans.append(p//val)
        return ans        
