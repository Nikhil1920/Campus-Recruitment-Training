
// Airline Restrictions
import java.util.Scanner;

class AirlineRestrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int arr[] = new int[3];
            int sum = 0;
            boolean result = false;
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int checked_limit = sc.nextInt();
            int hand_limit = sc.nextInt();
            if (sum <= (checked_limit + hand_limit)) {
                for (int i = 0; i < 3; i++) {
                    if (arr[i] <= hand_limit && (sum - arr[i]) <= checked_limit) {
                        result = true;
                        break;
                    }
                }
            }
            System.out.println(result ? "YES" : "NO");
        }
        sc.close();
    }
}