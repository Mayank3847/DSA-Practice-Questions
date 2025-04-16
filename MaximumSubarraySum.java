//Find the maximum sum of any subarray of size K in a given array. Write its algorithm, program.
public class MaximumSubarraySum {
    public static int maxSumSubarray(int[] arr, int K) {
        int n = arr.length;
        if (n < K) return -1;

        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < K; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        for (int i = K; i < n; i++) {
            windowSum += arr[i] - arr[i - K];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 3;
        System.out.println(maxSumSubarray(arr, K));
    }
}
