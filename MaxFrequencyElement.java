// Find the Element with Maximum Frequency in an Array

import java.util.*;

public class MaxFrequencyElement {
    public static int maxFrequencyElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 3, 4, 5};
        System.out.println(maxFrequencyElement(nums)); // Output: 3
    }
}

