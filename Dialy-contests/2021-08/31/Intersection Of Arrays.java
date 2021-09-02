import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();

            int[] count_a = new int[20001];
            int[] count_b = new int[20001];

            for (int i = 0; i < n; i++)
                count_a[sc.nextInt() + 10000]++;

            int m = sc.nextInt();
            for (int i = 0; i < m; i++)
                count_b[sc.nextInt() + 10000]++;

            int count = 0;
            for (int i = 0; i < 20001; i++) {
                if (count_a[i] != 0 && count_b[i] != 0) {
                    count++;
                }
            }
            System.out.println(count);

        }
        sc.close();
    }
}