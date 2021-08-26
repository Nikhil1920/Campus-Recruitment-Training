import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int transpose[][] = new int[c][r];
        int max_row_sum = 0;
        int max_col_sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < c; i++) {
            int row_sum = 0;
            for (int j = 0; j < r; j++) {
                transpose[i][j] = matrix[j][i];
                row_sum += transpose[i][j];
                System.out.print(transpose[i][j] + " ");
            }
            if (max_row_sum < row_sum)
                max_row_sum = row_sum;
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            int col_sum = 0;
            for (int j = 0; j < c; j++) {
                col_sum += transpose[j][i];
            }
            if (max_col_sum < col_sum)
                max_col_sum = col_sum;
        }
        System.out.println(Math.abs(max_row_sum - max_col_sum));

        sc.close();
    }
}