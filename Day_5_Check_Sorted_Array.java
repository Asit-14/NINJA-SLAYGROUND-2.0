public class Day_5_Check_Sorted_Array {
    public static int isSorted(int n, int[] arr) {
        if (n <= 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(a.length, a));

        int[] b = { 5, 3, 4, 2, 1 };
        System.out.println(isSorted(b.length, b));
    }
}
