// WAP to check whether a given number is Palindrome or not

public class Palindrome {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0, digit;
        while (num > 0) {
            digit = num % 10;
            rev = rev * 10 + digit;
            // rev = rev * 10 + (num % 10);
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
