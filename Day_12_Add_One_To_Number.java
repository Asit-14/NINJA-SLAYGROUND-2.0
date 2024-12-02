import java.util.ArrayList;

public class Day_12_Add_One_To_Number {
    public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr) {
        int n = arr.size();
        
        for (int i = n - 1; i >= 0; i--) {
            if (arr.get(i) < 9) {
                arr.set(i, arr.get(i) + 1);
                return removeLeadingZeros(arr);
            }
            arr.set(i, 0);
        }
        
        arr.add(0, 1);
        return removeLeadingZeros(arr);
    }
    
    private static ArrayList<Integer> removeLeadingZeros(ArrayList<Integer> arr) {
        while (arr.size() > 1 && arr.get(0) == 0) {
            arr.remove(0);
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(addOneToNumber(arr));
        
    }
}
