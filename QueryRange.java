//Write a program to find the sum of elements in a given range [L, R] using a prefix sum 

public class QueryRange {
    public static int rangeSum(int[] arr, int L, int R) {
        int[] prefixSum = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        return prefixSum[R + 1] - prefixSum[L];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int L = 1, R = 4;
        System.out.println(rangeSum(arr, L, R));
    }
}
