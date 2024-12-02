public class Day_15_Implement_Lower_Bound {
    public static int lowerBound(int[] arr, int n, int x) {
        int left = 0, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,7,4,6,3,7,9,0};
        int n = arr.length;
        int x = 4;
        int result = lowerBound(arr, n, x);
        System.out.println("Index of " + x + " is " + result);
        
    }
}
