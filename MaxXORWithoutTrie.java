import java.util.HashSet;
import java.util.Set;

public class MaxXORWithoutTrie {
    public static int findMaximumXOR(int[] nums) {
        int maxResult = 0;
        int mask = 0;

        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> prefixes = new HashSet<>();

            for (int num : nums) {
                prefixes.add(num & mask);
            }

            int candidate = maxResult | (1 << i);
           
            for (int prefix : prefixes) {
                if (prefixes.contains(prefix ^ candidate)) {
                    maxResult = candidate;
                    break;
                }
            }
        }

        return maxResult;
    }
    public static int findMaximumXORBrute(int[] nums) {
        int maxXOR = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int xor = nums[i] ^ nums[j];
                if (xor > maxXOR) {
                    maxXOR = xor;
                }
            }
        }

        return maxXOR;
    }


    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR is: " + findMaximumXOR(nums));
        System.out.println("Maximum XOR is: " + findMaximumXORBrute(nums));

    }
}

