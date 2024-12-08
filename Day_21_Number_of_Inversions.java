public class Day_21_Number_of_Inversions {

    public static int numberOfInversions(int[] a, int n) {
        return mergeSortAndCount(a, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] a, int left, int right) {
        int mid, invCount = 0;
        if (right > left) {
            mid = (right + left) / 2;

            invCount += mergeSortAndCount(a, left, mid);
            invCount += mergeSortAndCount(a, mid + 1, right);
            invCount += mergeAndCount(a, left, mid, right);
        }
        return invCount;
    }

    private static int mergeAndCount(int[] a, int left, int mid, int right) {
        int[] leftArray = new int[mid - left + 1];
        int[] rightArray = new int[right - mid];

        for (int i = 0; i < leftArray.length; i++)
            leftArray[i] = a[left + i];
        for (int j = 0; j < rightArray.length; j++)
            rightArray[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = left;
        int invCount = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                a[k++] = leftArray[i++];
            } else {
                a[k++] = rightArray[j++];
                invCount += (mid + 1) - (left + i);
            }
        }

        while (i < leftArray.length) {
            a[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            a[k++] = rightArray[j++];
        }

        return invCount;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 2, 4};
        System.out.println(numberOfInversions(a, a.length));
        
    }
}