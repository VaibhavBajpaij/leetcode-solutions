class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        n=len(rooms)
        vist=[0]*n

        node=0

        def dfs(node):
            vist[node]=1

            for val in rooms[node]:
                if(vist[val]==0):
                    dfs(val)

        dfs(node)
        print(vist)
        for v in range(1,len(rooms)):
            if(vist[v]==0):
                dfs(v)
                return False


            
        return True
