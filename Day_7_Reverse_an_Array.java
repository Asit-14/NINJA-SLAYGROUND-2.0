public class Day_7_Reverse_an_Array {
    public static int[] reverseArray(int n, int[] nums) {
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] reversed = reverseArray(nums.length, nums);
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
