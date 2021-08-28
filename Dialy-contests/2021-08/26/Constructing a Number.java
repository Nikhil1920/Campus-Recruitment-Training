
// ConstructingANumber
import java.util.Scanner;

class ConstructingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                while (arr[i] > 0) {
                    sum += arr[i] % 10;
                    arr[i] = arr[i] / 10;
                }
            }
            System.out.println(sum % 3 == 0 ? "Yes" : "No");
        }
        sc.close();
    }
}