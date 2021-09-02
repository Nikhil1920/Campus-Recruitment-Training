
// Small factorials
import java.math.BigInteger;
import java.util.Scanner;

class FCTRL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            BigInteger f = new BigInteger("1");
            for (int i = 2; i <= n; i++)
                f = f.multiply(BigInteger.valueOf(i));
            System.out.println(f);
        }
        sc.close();
    }
}