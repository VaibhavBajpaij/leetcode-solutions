from functools import cmp_to_key
class Solution(object):
   
    def largestNumber(self, nums):

        def compare(a,b):
            if(a+b>b+a):
                return -1
            elif(a+b<b+a):
                return 1
            else:
               return 0

        li=[]
        
        for val in nums:
            li.append(str(val))
        li.sort(key=cmp_to_key(compare))
         # If the largest number is '0', return '0'
        if li[0] == '0':
            return '0'

        # Join all numbers into a single string
        return ''.join(li)

        
