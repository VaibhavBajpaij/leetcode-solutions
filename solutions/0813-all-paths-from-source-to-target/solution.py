class Solution:
    def dfs(self,adj, node, temp,ans):
        if node==len(adj)-1 :
            temp.append(node)
            print(node)
            if(temp[0]==0):
                ans.append(temp[:])
            temp.pop()
            return 
        

        
        temp.append(node)
        for i in adj[node]:
            
                
            self.dfs(adj,i,temp,ans)
        temp.pop()
            

    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        
        
        
        ans=[]
        temp=[]
        

       
            
        self.dfs(graph,0,temp,ans)
            
        return ans
            
        
