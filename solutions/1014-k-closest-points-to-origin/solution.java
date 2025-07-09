

class Triplet implements Comparable<Triplet> {
    int d;
    int x;
    int y;

    Triplet(int d, int x, int y) {
        this.d = d;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplet t) {
        return this.d - t.d; 
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder()); // Max Heap

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int distance = x * x + y * y;

            pq.add(new Triplet(distance, x, y));
            if (pq.size() > k) pq.remove();
        }

        int[][] ans = new int[k][];
        int i = 0;
        while (!pq.isEmpty()) {
            Triplet t = pq.remove();
            ans[i++] = new int[]{t.x, t.y};
        }

        return ans;
    }
}

