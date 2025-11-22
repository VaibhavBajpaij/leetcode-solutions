from typing import List

class Solution:
    def lexSmallestNegatedPerm(self, n: int, target: int) -> List[int]:
        # total sum of 1..n
        S = n * (n + 1) // 2

        # if target magnitude too large, impossible
        if abs(target) > S:
            return []

        diff = S - target
        # must be even because flipping a number x changes sum by 2*x
        if diff % 2 != 0:
            return []

        neg_list: List[int] = []         # will store negative entries (as negative ints)
        chosen = [False] * (n + 1)       # chosen[i] == True means i is negated
        j = n

        # Greedily consume diff by taking up to 2*j each step (i.e. flipping j),
        # or whatever even remainder remains.
        while diff > 0 and j >= 1:
            take = min(2 * j, diff)   # an even number <= 2*j and <= diff
            x = take // 2             # the actual value to negate (1 <= x <= j)
            neg_list.append(-x)
            chosen[x] = True
            diff -= take
            j -= 1

        # If diff wasn't exhausted (shouldn't happen if logic correct) -> impossible
        if diff != 0:
            return []

        # Append all remaining positive numbers in increasing order
        ans: List[int] = neg_list + [i for i in range(1, n + 1) if not chosen[i]]
        return ans

