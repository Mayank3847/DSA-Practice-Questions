//Check if an array can be split into two parts such that the sum of the prefix equals the 
//sum of the suffix
public class SplitArray {
    public static boolean canBeSplit(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return true;
            }
            leftSum += arr[i];
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 6 };
        System.out.println(canBeSplit(arr));
    }
}
