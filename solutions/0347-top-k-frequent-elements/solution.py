from typing import List

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}

        for val in nums:
            freq[val] = freq.get(val, 0) + 1

        dsorted = sorted(freq.items(), key=lambda x: x[1], reverse=True)

        ans = []
        for key, value in dsorted[:k]:
            ans.append(key)

        return ans
