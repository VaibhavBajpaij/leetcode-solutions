class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        curr=0
        c=0
        g=0
        start=0
        for i in range(len(gas)):
            c+=cost[i]
            g+=gas[i]

            curr=curr+gas[i]-cost[i]
            if(curr<0):
                curr=0
                start=i+1
        if(c>g):
            return -1
        return start

        
