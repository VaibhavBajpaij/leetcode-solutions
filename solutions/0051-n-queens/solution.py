from typing import List

class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        ans = []

        cols = set()      # occupied columns
        diag1 = set()     # r - c
        diag2 = set()     # r + c

        board = [["." for _ in range(n)] for _ in range(n)]

        def backtrack(row):
            if row == n:
                ans.append(["".join(r) for r in board])
                return

            for col in range(n):
                if (col in cols or
                    row - col in diag1 or
                    row + col in diag2):
                    continue

                # Place Queen
                board[row][col] = "Q"
                cols.add(col)
                diag1.add(row - col)
                diag2.add(row + col)

                backtrack(row + 1)

                # Remove Queen
                board[row][col] = "."
                cols.remove(col)
                diag1.remove(row - col)
                diag2.remove(row + col)

        backtrack(0)
        return ans
