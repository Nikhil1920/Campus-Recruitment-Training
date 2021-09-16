
// Can you reorder
import java.util.Scanner;

class reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[2 * n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();

            int temp = arr[0];
            boolean result = true;
            for (int i = 1; i < arr.length && result; i++) {
                if (temp != arr[i])
                    result = false;
            }
            System.out.println(!result ? "Yes" : "No");
        }
        sc.close();
    }
}