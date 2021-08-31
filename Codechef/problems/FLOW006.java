import java.util.Scanner;

class FLOW006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                sum += (n % 10);
                n = n / 10;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}