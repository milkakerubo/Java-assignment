public class sixteen {
    public static boolean isPalindrome(int n) {
        int original = n, reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121; // Example input
        System.out.println(num + " is palindrome: " + isPalindrome(num));
    }
}

