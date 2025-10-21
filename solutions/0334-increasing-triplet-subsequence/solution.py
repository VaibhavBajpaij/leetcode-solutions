class Solution(object):
    def increasingTriplet(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        # n=len(nums)
        # if(n==3):
        #     if(nums[0]<nums[1] and nums[1]<nums[2]):
        #         return True
        #     else:
        #         return False
        # if(n<3):
        #     return False
        # ma=0
        # imax=0
        # imin=-1
        # mi=1000000000

        # mid=0
        # imid=0
        # for i in range(n-2):
        #     if(mi>nums[i]):
        #         mi=nums[i]
        #         imin=i
        # for i in range(imin+1,n):
        #     if(nums[i]>mi and nums[i]>ma):
        #         ma=nums[i]
        #         imax=i
        # for i in range(imin+1,imax):
        #     if(nums[i]>mi and nums[i]<ma):
        #         imid=i
        #         break
        # if(imin<imid and imid<imax):
        #     return True


        
        
        # for j in range(0,n):
        #     x=nums[j]
        #     print(x)
        #     c=1
        #     y=-1
        #     z=-1
            
        #     for i in range(j+1,n):

        #         if(y==-1 and nums[i]<x):
        #             x=nums[i]
        #         elif(y==-1 and nums[i]>x):
        #             y=nums[i]
        #             print
        #             c=2
        #         if(z==-1 and c==2 and  nums[i]<y and nums[i]>x):
        #             y=nums[i]
        #         elif(z==-1 and c==2 and nums[i]>y):
        #             z=nums[i]
        #             c=3
        #             return True
       

            
        # return False

        
    def increasingTriplet(self, nums):
        first = second = float('inf')  # Initialize two smallest numbers
        
        for n in nums:
            if n <= first:
                first = n  # new smallest number
            elif n <= second:
                second = n  # new second smallest number
            else:
                # Found a number greater than both — triplet exists
                return True
        
        return False

        
