
// Square root
import java.util.Scanner;

class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            long x = sc.nextLong();
            if (x == 0 || x == 1)
                System.out.println(x);
            else {
                int i = 1, result = 1;

                while (result <= x) {
                    i++;
                    result = i * i;
                }
                System.out.println(i - 1);
            }
        }
        sc.close();
    }
}