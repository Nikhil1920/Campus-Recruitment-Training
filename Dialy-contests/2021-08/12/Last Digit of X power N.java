import java.util.Scanner;

class LastDigitofX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            String n = sc.next();
            long p = sc.nextLong();
            int last_digit = n.charAt(n.length() - 1) - '0';
            if (p == 0)
                System.out.println(1);
            else if (last_digit == 0 || last_digit == 1 || p == 1) {
                System.out.println(last_digit);
            } else {
                int exp = (int) (p % 4);

                if (exp == 0)
                    exp = 4;

                int result = 1;
                for (int i = 0; i < exp; i++) {
                    result *= last_digit;
                }
                System.out.println(result % 10);
            }
            num_of_cases--;
        }
        sc.close();
    }
}