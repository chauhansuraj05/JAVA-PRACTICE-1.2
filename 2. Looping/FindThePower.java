// WAP to find power of a number without using inbuilt method

public class FindThePower {
    public static void main(String[] args) {
        int base = 2, power = 5, result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}
