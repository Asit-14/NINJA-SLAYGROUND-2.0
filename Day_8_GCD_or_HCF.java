public class Day_8_GCD_or_HCF {
    public static int calcGCD(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return Math.abs(n);
    }

    public static void main(String[] args) {
        System.out.println(calcGCD(48, 18));
    }
}
