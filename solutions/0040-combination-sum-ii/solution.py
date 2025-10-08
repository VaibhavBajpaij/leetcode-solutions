class Solution(object):
    def sum(self, arr, target, i, result, temp):
        # base conditions
        if target == 0:
            result.append(list(temp))  # store copy
            return
        if target < 0 or i >= len(arr):
            return

        # iterate through remaining elements
        for j in range(i, len(arr)):
            # skip duplicates
            if j > i and arr[j] == arr[j - 1]:
                continue
            # choose current number
            temp.append(arr[j])
            # move ahead (since each number used once)
            self.sum(arr, target - arr[j], j + 1, result, temp)
            # backtrack
            temp.pop()

    def combinationSum2(self, candidates, target):
        candidates.sort()  # sort to handle duplicates
        result = []
        self.sum(candidates, target, 0, result, [])
        return result

