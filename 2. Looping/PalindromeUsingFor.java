public class PalindromeUsingFor {

    public static void main(String[] args) {

        int num = 121;
        int temp = num;
        int rev = 0;

        // for loop instead of while
        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
