import java.util.Scanner;

class FLOW013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += sc.nextInt();

            System.out.println(sum == 180 ? "YES" : "NO");
        }
        sc.close();
    }
}