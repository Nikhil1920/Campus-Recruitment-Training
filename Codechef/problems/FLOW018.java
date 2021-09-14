import java.util.Scanner;

class FLOW018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int num = sc.nextInt();
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println(result);
        }
        sc.close();
    }
}