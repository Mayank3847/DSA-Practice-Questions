import java.util.Arrays;

public class CountBits {
    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        System.out.println("Number of 1s from 0 to " + n + ": " + Arrays.toString(result));
    }
}
