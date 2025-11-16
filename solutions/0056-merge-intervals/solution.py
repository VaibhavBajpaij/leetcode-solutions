class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
       
        ans=[]
        i=0
        while(len(intervals)-1>i):
            x=intervals[i][0]
            y=intervals[i][1]
            a=intervals[i+1][0]
            b=intervals[i+1][1]
            if(y>=a and y>b ):
                intervals[i][0]=x
                intervals[i][1]=y
                intervals.remove([a,b])
            elif(y>=a):
                intervals[i][0]=x
                intervals[i][1]=b
                intervals.remove([a,b])
            else:
                i+=1

                

        return intervals
        
