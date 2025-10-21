class Solution(object):
    def wiggleSort(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        nums.sort()
        n = len(nums)
        
        half = (n + 1) // 2
        left = nums[:half][::-1]   # reverse left half
        right = nums[half:][::-1]  # reverse right half
        
        i = j = 0
        for k in range(n):
            if k % 2 == 0:
                nums[k] = left[i]
                i += 1
            else:
                nums[k] = right[j]
                j += 1

