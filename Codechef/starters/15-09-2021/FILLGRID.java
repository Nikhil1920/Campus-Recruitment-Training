import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

class FILLGRID {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++)
                        log.write("-1 ");
                    log.write("\n");
                }
            } else {
                int[][] arr = new int[n][n];
                for (int[] row : arr)
                    Arrays.fill(row, 1);
                int k = 0;
                for (int i = 0; i < n; i++) {
                    arr[i][k] = -1;
                    k++;
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        log.write(arr[i][j] + " ");
                    }
                    log.write("\n");
                }
            }
        }
        log.flush();
        log.close();
        sc.close();
    }
}