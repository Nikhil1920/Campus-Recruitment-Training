
// CanIbeanamstrong
import java.util.Scanner;

class CanIbeanamstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int diagonal_sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    diagonal_sum += matrix[i][j];
                }
                if ((i + j) == (r - 1))
                    diagonal_sum += matrix[i][j];
            }
        }
        System.out.println(isArmstrong(diagonal_sum) ? "Yes" : "No");
        sc.close();
    }

    public static boolean isArmstrong(int num) {
        boolean isArmstrong = false;
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += Math.pow(temp % 10, 3);
            temp /= 10;
        }
        if (sum == num) {
            isArmstrong = true;
        }
        return isArmstrong;
    }
}