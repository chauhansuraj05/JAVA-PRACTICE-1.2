//WAP to find the smallest digit in a given number

public class SmallestDigit {

    public static void main(String[] args) {
        int num = 4826, digit, min = 9;
        while (num > 0) {
            digit = num % 10;
            if (digit < min) {
                min = digit;
            }
            num = num / 10;

        }
        System.out.println(min);
    }

}
