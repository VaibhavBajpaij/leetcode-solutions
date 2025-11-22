class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if(len(nums)<1):
            return nums
        if(len(nums)==1):
            nums[0]=str(nums[0])
            return nums

        output=[]
        temp=[nums[0]]
        for i in range(len(nums)-1):
                if(nums[i]==nums[i+1]-1):
                    temp.append(nums[i+1])
                else:
                    n=len(temp)
                    if(n==1):
                        x=str(temp[0])
                        output.append(x)
                    else:
                        s= str(temp[0])+ "->" +str(temp[n-1])
                        output.append(s)
                    temp.clear()
                    temp.append(nums[i+1])
        n=len(temp)
        if(n==1):
            x=str(temp[0])
            output.append(x)
        else:
           
            s= str(temp[0])+ "->" +str(temp[n-1])
            output.append(s)
                    
        
        return output
        

        
