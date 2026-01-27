// WAP to check whether a number is Prime or not

public class PrintPrimeNo {
    public static void main(String[] args) {
        int num = 7, count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
