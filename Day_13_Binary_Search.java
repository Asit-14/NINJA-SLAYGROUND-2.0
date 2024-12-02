public class Day_13_Binary_Search {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,7,8,3};
        int target = 4;
        System.out.println(search(nums, target));   

    }
}
