
// CheckMyMagicnumbers
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            int[] array = new int[n];
            int array_sum = 0;
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
                array_sum += array[i];
            }
            for (int i = 0; i < n; i++) {
                int temp = array_sum - array[i];
                if (array[i] + k > temp) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}