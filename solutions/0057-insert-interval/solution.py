from typing import List

class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        res = []
        i = 0
        n = len(intervals)
        s, e = newInterval

        # Add all intervals ending before newInterval starts
        while i < n and intervals[i][1] < s:
            res.append(intervals[i])
            i += 1

        # Merge all intervals that overlap with newInterval
        while i < n and intervals[i][0] <= e:
            s = min(s, intervals[i][0])
            e = max(e, intervals[i][1])
            i += 1
        # Add merged interval
        res.append([s, e])

        # Add remaining intervals
        while i < n:
            res.append(intervals[i])
            i += 1

        return res

