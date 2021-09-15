
// Snake Pattern
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            boolean leftToRight = true;
            for (int i = 0; i < n; i++) {
                if (leftToRight) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                leftToRight = !leftToRight;
            }
            System.out.println();
        }
        sc.close();
    }
}