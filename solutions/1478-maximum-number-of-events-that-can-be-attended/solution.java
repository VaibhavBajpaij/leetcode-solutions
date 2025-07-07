import java.util.*;

class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1])); // sort by end time
        
        TreeSet<Integer> availableDays = new TreeSet<>();
        for (int d = 1; d <= 100000; d++) {
            availableDays.add(d);
        }

        int count = 0;
        for (int[] event : events) {
            Integer day = availableDays.ceiling(event[0]); // find smallest available day >= start
            if (day != null && day <= event[1]) {
                count++;
                availableDays.remove(day); // mark this day as used
            }
        }

        return count;
    }
}

