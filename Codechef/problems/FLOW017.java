import java.util.Scanner;

class FLOW017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = c;
            if (a < b && a > c || a < c && a > b) {
                result = a;
            } else if (b < a && b > c || b < c && b > a) {
                result = b;
            }
            System.out.println(result);
        }
        sc.close();
    }
}