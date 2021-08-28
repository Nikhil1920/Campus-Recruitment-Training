
// Flippingbits
import java.util.Scanner;

class Flippingbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            long n = sc.nextLong();
            long sum = 4294967295L;
            System.out.println(sum - n);
        }
        sc.close();
    }
}