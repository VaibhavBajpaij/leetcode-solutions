class Solution:
    def minReorder(self, n: int, connections: List[List[int]]) -> int:

        # Create adjacency list for an undirected graph
        graph = [[] for _ in range(n)]

        # Store original directed edges
        roads = set()

        # Build graph
        for a, b in connections:

            # Add both directions so DFS can visit every node
            graph[a].append(b)
            graph[b].append(a)

            # Remember original direction a -> b
            roads.add((a, b))

        # Track visited nodes during DFS
        visited = set()

        def dfs(node):

            # Mark current node as visited
            visited.add(node)

            # Number of reversals needed in this subtree
            changes = 0

            # Visit all neighbors
            for nei in graph[node]:

                # Skip already visited nodes
                if nei not in visited:

                    # If original edge is node -> nei
                    # then it points away from city 0
                    # and must be reversed
                    if (node, nei) in roads:
                        changes += 1

                    # Add reversals needed in neighbor's subtree
                    changes += dfs(nei)

            # Return total reversals from this subtree
            return changes

        # Start DFS from city 0
        return dfs(0)
