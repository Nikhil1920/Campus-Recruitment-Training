
// RumisMatrix
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int row_count = sc.nextInt();
            int column_count = sc.nextInt();
            int[][] matrix = new int[row_count][column_count];
            for (int i = 0; i < row_count; i++) {
                for (int j = 0; j < column_count; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int num = sc.nextInt();
            boolean found = false;
            int start = 0;
            int end = row_count * column_count - 1;
            while (start <= end && !found) {
                int mid = (start + end) / 2;
                int mid_val = matrix[mid / column_count][mid % column_count];
                if (mid_val == num) {
                    found = true;
                } else if (mid_val < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            System.out.println(found ? "True" : "False");
        }
        sc.close();
    }
}