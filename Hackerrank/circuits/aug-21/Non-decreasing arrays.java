
// Non-decreasing arrays
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            long[] result = new long[n];
            result[0] = arr[0];
            for (int i = 1; i < n; i++) {
                result[i] = ((result[i - 1] + arr[i] - 1) / arr[i]) * arr[i];
            }
            for (int i = 0; i < n; i++)
                System.out.print(result[i] + " ");
            System.out.println();
        }
        sc.close();
    }
}