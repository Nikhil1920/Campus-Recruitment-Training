
// RumisMatrix
import java.util.Scanner;

class RumisMatrix {
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
            int row = 0, column = column_count - 1;
            while (!found && row < row_count && column >= 0) {
                if (matrix[row][column] == num)
                    found = true;
                else if (matrix[row][column] > num)
                    column--;
                else
                    row++;
            }
            System.out.println(found ? "True" : "False");
        }
        sc.close();
    }
}