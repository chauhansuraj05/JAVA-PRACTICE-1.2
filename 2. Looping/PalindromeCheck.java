// WAP to check whether a given String is Palindrome or not

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Radar";
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}