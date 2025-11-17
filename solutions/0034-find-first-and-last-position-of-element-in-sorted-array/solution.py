class Solution:
    def searchRange(self, nums, target):
        n = len(nums)
        
        # ---------- FIND LEFT (FIRST OCCURRENCE) ----------
        st, l = 0, n - 1
        left = -1
        
        while st <= l:
            mid = (st + l) // 2
            if nums[mid] == target:
                left = mid
                l = mid - 1   # keep searching left side
            elif nums[mid] > target:
                l = mid - 1
            else:
                st = mid + 1

        # If target is not found at all
        if left == -1:
            return [-1, -1]

        # ---------- FIND RIGHT (LAST OCCURRENCE) ----------
        st, l = 0, n - 1
        right = -1
        
        while st <= l:
            mid = (st + l) // 2
            if nums[mid] == target:
                right = mid
                st = mid + 1   # keep searching right side
            elif nums[mid] > target:
                l = mid - 1
            else:
                st = mid + 1

        return [left, right]

