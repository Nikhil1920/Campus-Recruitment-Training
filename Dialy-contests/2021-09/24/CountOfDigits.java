
// CountOfDigits
import java.util.Scanner;

class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            System.out.println((n + 1) / 10);
        }
        sc.close();
    }
}