// Check if an Integer is a Palindrome Without Converting to a String

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num)); // Output: true

        num = -121;
        System.out.println(isPalindrome(num)); // Output: false

        num = 10;
        System.out.println(isPalindrome(num)); // Output: false
    }
}

