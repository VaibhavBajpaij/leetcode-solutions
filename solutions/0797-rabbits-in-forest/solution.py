class Solution(object):
    def numRabbits(self, answers):
        """
        :type answers: List[int]
        :rtype: int
        """
        d={}
        for val in answers:
            if(val in d):
                d[val]=d[val]+1
            else:
                d[val]=1
        ans=0
        print(d)
        for key in d:
            val=d[key]
            if(key+1==val):
                ans+=key+1
            elif(key==0):
                ans+=val
            elif(key+1>val):
                ans+=key+1
            elif(key+1<val):
                while(d[key]>0):
                   
                    ans+=key+1
                    d[key]=d[key]-key-1


        return ans
                

                

        
