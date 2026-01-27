// WAP to find sum of first 10 natural numbers

public class PrintNaturalNo {
    public static void main(String[] args) {
        int num = 10, sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
