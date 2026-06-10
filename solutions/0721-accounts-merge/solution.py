class DJU:
    def __init__(self,n):
        self.parent=list(range(n))
        self.rank=[0]*n
    def find(self,i):
        if(self.parent[i]==i):
            return self.parent[i]
        return self.find(self.parent[i])
    def union(self,x,y):
        s1=self.find(x)
        s2=self.find(y)
        if(self.rank[s1]>self.rank[s2]):
            self.parent[s2]=s1
        elif(self.rank[s1]<self.rank[s2]):
            self.parent[s1]=s2
        else:
            self.parent[s1]=s2
            self.rank[s2]+=1

class Solution:
    def accountsMerge(self, accounts: List[List[str]]) -> List[List[str]]:
        n = len(accounts)

        # Create Disjoint Set
        ds = DJU(n)

        # Map to store email -> account index
        mapMailNode = {}

        # Step 1: Union accounts having common emails
        for i in range(n):
            for j in range(1, len(accounts[i])):
                mail = accounts[i][j]

                if mail not in mapMailNode:
                    mapMailNode[mail] = i
                else:
                    ds.union(i, mapMailNode[mail])

        # Step 2: Group emails under ultimate parent
        mergedMail = [[] for _ in range(n)]
        for mail, idx in mapMailNode.items():
            node = ds.find(idx)
            mergedMail[node].append(mail)

        # Step 3: Prepare final merged result
        ans = []
        for i in range(n):
            if not mergedMail[i]:
                continue

            mergedMail[i].sort()
            temp = [accounts[i][0]]

            for mail in mergedMail[i]:
                temp.append(mail)

            ans.append(temp)

        # Sort final answer
        ans.sort()
        return ans
        
