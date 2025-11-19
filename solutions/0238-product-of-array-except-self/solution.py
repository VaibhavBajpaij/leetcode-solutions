class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        flag=False
        z=0
        zero=0
        p=1
        if(len(nums)==1):
            return nums[0]

        for val in nums:
            if(val==0):
                flag=True
                zero+=1
            else:
                p*=val
                z+=1
        if(z==1 and len(nums)==2):
            nums[1],nums[0]=nums[0],nums[1]
            return nums
        print(z)

        if(flag and z>1 and zero<2):

            for i in range(len(nums)):
                if(nums[i]==0):
                    nums[i]=p
                else:
                    nums[i]=0
        elif(flag and z<2 or zero>=2):
            for i in range(len(nums)):
                nums[i]=0

        else:
            for i in range(len(nums)):
                val=nums[i]
                a=p//val
                nums[i]=a
        return nums


        
