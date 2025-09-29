class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        """
        :type gas: List[int]
        :type cost: List[int]
        :rtype: int
        """
        g=0
        c=0
         
        curr=0
        start=0

        for i in range(len(gas)):
            g+=gas[i]
            c+=cost[i]
            curr+=gas[i]-cost[i]
            if(curr<0):
                curr=0
                start=i+1
       
        if(g<c):
            return -1
        
        return start
