// K-th Smallest Element in a Sorted Matrix

import java.util.PriorityQueue;

public class KthSmallestInMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Element> minHeap = new PriorityQueue<>();

        for (int i = 0; i < Math.min(n, k); i++) {
            minHeap.offer(new Element(i, 0, matrix[i][0]));
        }

        for (int i = 0; i < k - 1; i++) {
            Element curr = minHeap.poll();
            if (curr.col + 1 < n) {
                minHeap.offer(new Element(curr.row, curr.col + 1, matrix[curr.row][curr.col + 1]));
            }
        }

        return minHeap.poll().val;
    }

    static class Element implements Comparable<Element> {
        int row, col, val;

        Element(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }

        public int compareTo(Element other) {
            return Integer.compare(this.val, other.val);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k));
    }
}
