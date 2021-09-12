import java.util.Scanner;

class ChefAndBulbInvention {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            int k = sc.nextInt();
            int i = 0, days = 0, m = (p % k) - 1, x = ((n - 1) / k) * k;
            x = n - 1 - x;
            if (m > x)
                days += (x + 1) * ((n - 1) / k + 1) + (m - x) * ((n - 1) / k);
            else
                days += ((n - 1) / k + 1) * (m + 1);
            for (i = m + 1; i < n; i += k) {
                days++;
                if (i == p)
                    break;
            }
            System.out.println(days);
            num_of_cases--;
        }
        sc.close();
    }
}