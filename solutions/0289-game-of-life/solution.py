class Solution:
    def gameOfLife(self, matrix):
        m = len(matrix)
        n = len(matrix[0])

        # deep copy
        ans = [[matrix[i][j] for j in range(n)] for i in range(m)]

        for i in range(m):
            for j in range(n):
                val = matrix[i][j]

                # FUNCTION: safely count neighbors
                def safe(i2, j2):
                    if 0 <= i2 < m and 0 <= j2 < n:
                        return matrix[i2][j2]
                    return 0

                # SUM ALL VALID NEIGHBOURS
                s = (
                    safe(i-1, j-1) + safe(i-1, j) + safe(i-1, j+1) +
                    safe(i,   j-1)               + safe(i,   j+1) +
                    safe(i+1, j-1) + safe(i+1, j) + safe(i+1, j+1)
                )

                # APPLY RULES
                if val == 1:
                    if s < 2 or s > 3:
                        ans[i][j] = 0
                else:
                    if s == 3:
                        ans[i][j] = 1

        # Copy result back to matrix
        for i in range(m):
            for j in range(n):
                matrix[i][j] = ans[i][j]

