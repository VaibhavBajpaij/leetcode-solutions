from typing import List

class Solution:
    def valid(self, n, i, ans, L, pre):
        if len(ans) == n:
            L.append("".join(ans))
            return

        # place 1
        ans.append("1")
        self.valid(n, i + 1, ans, L, "1")
        ans.pop()

        # place 0 if previous wasn't 0
        if len(ans) == 0 or ans[-1] != "0":
            ans.append("0")
            self.valid(n, i + 1, ans, L, "0")
            ans.pop()

    def validStrings(self, n: int) -> List[str]:
        L = []
        self.valid(n, 0, [], L, "")
        return L
