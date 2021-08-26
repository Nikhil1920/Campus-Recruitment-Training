
// FLOW001
import java.util.Scanner;

class FLOW001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            System.out.println(sum);
        }
        sc.close();
    }
}