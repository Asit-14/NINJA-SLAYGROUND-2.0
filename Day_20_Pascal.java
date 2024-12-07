import java.util.ArrayList;

public class Day_20_Pascal {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        if (n == 0) {
            return result;
        }

        ArrayList<Long> row = new ArrayList<>();
        row.add(1L);
        result.add(new ArrayList<>(row));

        for (int i = 1; i < n; i++) {
            ArrayList<Long> newRow = new ArrayList<>();
            newRow.add(1L);

            for (int j = 1; j < i; j++) {
                newRow.add(row.get(j - 1) + row.get(j));
            }

            newRow.add(1L);
            result.add(newRow);
            row = newRow;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(printPascal(5));
        
    }
}
