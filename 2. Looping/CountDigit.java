// WAP to count number of digits in a given number

public class CountDigit {
    public static void main(String[] args) {
        int num = 1234, count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }

}
