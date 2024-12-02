import java.util.Scanner;

public class Day_2_Nth_Fibonacci_Number {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int fib = 0;
        for (int i = 3; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the Fibonacci number you want to find: ");
        int n = scanner.nextInt();
        System.out.println(fibonacci(n));
    }
}