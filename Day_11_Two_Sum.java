import java.util.HashSet;

public class Day_11_Two_Sum {
    public static String read(int n, int[] book, int target) {
        HashSet<Integer> seenPages = new HashSet<>();
        
        for (int pages : book) {
            int requiredPages = target - pages;
            if (seenPages.contains(requiredPages)) {
                return "YES";
            }
            seenPages.add(pages);
        }
        
        return "NO";
    }

    public static void main(String[] args) {
        int n = 5;
        int target = 5;
        int[] book = {4, 1, 2, 3, 1};
        System.out.println(read(n, book, target)); 
    }
}
