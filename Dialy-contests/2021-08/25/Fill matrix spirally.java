import java.util.Scanner;

class FillMatrixSpirally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int num = 1;
            int up = 0;
            int left = 0;
            int down = r - 1;
            int right = c - 1;
            int matrix[][] = new int[r][c];
            while (num <= r * c) {
                for (int col = left; col <= right; col++) {
                    matrix[up][col] = num;
                    num++;
                }
                for (int row = up + 1; row <= down; row++) {
                    matrix[row][right] = num;
                    num++;
                }

                if (up != down) {

                    for (int col = right - 1; col >= left; col--) {
                        matrix[down][col] = num;
                        num++;
                    }
                }

                if (left != right) {
                    for (int row = down - 1; row > up; row--) {
                        matrix[row][left] = num;
                        num++;
                    }
                }
                left++;
                right--;
                up++;
                down--;
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}