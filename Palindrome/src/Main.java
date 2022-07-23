public class Main {
    public static void main(String[] args) {
        isPalindrome(101);
    }
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int num = number;
        while (num != 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        if (reverse == number) {
            System.out.println(reverse + " " + number );
            return true;
        } else
            return false;
    }
}