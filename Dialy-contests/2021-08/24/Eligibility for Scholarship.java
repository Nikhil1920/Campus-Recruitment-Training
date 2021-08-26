
// EligibilityforScholarship
import java.util.Scanner;

class EligibilityforScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            result += input.charAt(i) - '0';
        }
        System.out.println(result);
        System.out.println(result > 20 ? "YES" : "NO");
        sc.close();
    }
}