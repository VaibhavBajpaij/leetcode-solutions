// Java code to find the majority element (> n/2 times)
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Find the element with frequency > n/2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey(); // Majority element found
            }
        }

        return -1; // No majority element found
    }
}

