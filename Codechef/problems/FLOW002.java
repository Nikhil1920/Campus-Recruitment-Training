import java.util.Scanner;

class FLOW002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a % b);
        }
        sc.close();
    }
}