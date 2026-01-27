// 🔹 15. WAP to find the largest digit in a given number

public class LargestDigit {
    public static void main(String[] args) {
        int num = 4826, digit, max = 0;
        while (num > 0) {
            digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num = num / 10;

        }
        System.out.println(max);
    }

}
