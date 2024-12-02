import java.util.Scanner;

public class Day_3_Number_of_digits {
        public static int countDigits(int n) {
        int count = 0;
        if (n == 0) {
            return 1; 
        }
        while (n != 0) {
            n /= 10; 
            count++; 
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(countDigits(n));
    }
}
