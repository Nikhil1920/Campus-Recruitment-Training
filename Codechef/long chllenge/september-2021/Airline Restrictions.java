
// Airline Restrictions
import java.util.Scanner;

class AirlineRestrictions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int a, b, c, d, e;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            e = sc.nextInt();
            boolean flag = true;
            if (a + b <= d && c <= e) {
                flag = true;
            } else if (b + c <= d && a <= e) {
                flag = true;
            } else if (a + c <= d && b <= e) {
                flag = true;
            } else {
                flag = false;
            }

            System.out.println(flag ? "YES" : "NO");
        }
        sc.close();
    }
}