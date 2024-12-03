public class Day_17_Implement_Upper_Bound {
    public static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,85,34,5,74,2,65};
        int x = 5;
        int n = arr.length;
        int result = upperBound(arr, x, n);
        System.out.println("Upper bound of " + x + " is " + result);
    }
}
