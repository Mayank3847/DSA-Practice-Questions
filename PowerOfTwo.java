public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(num + " is power of two: " + isPowerOfTwo(num));

        num = 18;
        System.out.println(num + " is power of two: " + isPowerOfTwo(num));
    }
}
