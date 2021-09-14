import java.util.Scanner;

class MUFFINS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            if (n > 2) {
                n = (n / 2) + 1;
            }
            System.out.println(n);
        }
        sc.close();
    }
}