
// WhoLettheDogsOut
import java.util.Arrays;
import java.util.Scanner;

class WhoLettheDogsOut {
    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            System.out.print("Case #" + count + ": ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[n - i - 1] + " ");
            }
            System.out.println();
            count++;
        }
        sc.close();
    }
}