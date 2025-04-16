// Count Numbers with Unique Digits

public class CountUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int count = 10, uniqueDigits = 9, available = 9;

        for (int i = 2; i <= n && available > 0; i++) {
            uniqueDigits *= available;
            count += uniqueDigits;
            available--;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(countNumbersWithUniqueDigits(n));
    }
}

