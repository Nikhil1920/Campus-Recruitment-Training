import java.util.Scanner;

class NumberTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int odd = 1;
            int even = 2;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(odd + " ");
                        odd += 2;
                    }
                } else {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(even + " ");
                        even += 2;
                    }
                }
                System.out.println();
            }
            System.out.println();
            num_of_cases--;
        }
        sc.close();
    }
}