

class FindSumPairs {
    private int[] nums1;
    private int[] nums2;
    private Map<Integer, Integer> freqMap; // stores frequency of elements in nums2

    // Constructor
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        freqMap = new HashMap<>();
        // Build frequency map for nums2
        for (int num : nums2) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    }

    // Add value to nums2[index]
    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        // Update frequency map
        freqMap.put(oldVal, freqMap.get(oldVal) - 1);
        if (freqMap.get(oldVal) == 0) {
            freqMap.remove(oldVal);
        }

        freqMap.put(newVal, freqMap.getOrDefault(newVal, 0) + 1);
        nums2[index] = newVal; // update the array
    }

    // Count pairs (i, j) such that nums1[i] + nums2[j] == tot
    public int count(int tot) {
        int pairCount = 0;
        for (int num1 : nums1) {
            int complement = tot - num1;
            pairCount += freqMap.getOrDefault(complement, 0);
        }
        return pairCount;
    }
}

