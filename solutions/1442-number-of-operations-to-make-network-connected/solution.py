class DJS:
    def __init__(self,n):
        self.parent=list(range(n))
        self.rank=[0]*n

    def find(self,i):
        if(self.parent[i]==i):
            return self.parent[i]
        return self.find(self.parent[i])
    def union(self,a,b):
        s1=self.find(a)
        s2=self.find(b)

        if(s1!=s2):
            if(self.rank[s1]>self.rank[s2]):
                self.parent[s2]=s1
            elif(self.rank[s2]>self.rank[s1]):
                self.parent[s1]=s2
            else:
                self.parent[s1]=s2
                self.rank[s1]+=1
class Solution:

    def makeConnected(self, n: int, connections: List[List[int]]) -> int:
        obj=DJS(n)
        if(len(connections)<n-1):
            return -1
        count=0
        for v,u in connections:
            obj.union(v,u)
        for i in range(n):
            if(obj.parent[i]==i):
                count+=1
        return count-1
        

        
