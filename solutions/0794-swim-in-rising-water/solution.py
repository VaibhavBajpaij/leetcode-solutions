class Solution:
    def swimInWater(self, grid: List[List[int]]) -> int:
        n = len(grid)

        # Initialize min-heap with starting cell
        heap = [(grid[0][0], 0, 0)]

        # Visited matrix
        visited = [[False] * n for _ in range(n)]
        visited[0][0] = True

        # Direction vectors
        dirs = [(0,1), (1,0), (0,-1), (-1,0)]

        # Process heap
        while heap:
            # Pop cell with lowest elevation
            elevation, r, c = heapq.heappop(heap)

            # If destination reached
            if r == n - 1 and c == n - 1:
                return elevation

            # Explore neighbors
            for dr, dc in dirs:
                nr, nc = r + dr, c + dc

                # Check bounds and if unvisited
                if 0 <= nr < n and 0 <= nc < n and not visited[nr][nc]:
                    visited[nr][nc] = True
                    heapq.heappush(heap, (max(elevation, grid[nr][nc]), nr, nc))
        return -1
        
