
// Summing Triplets
import java.util.Scanner;

class Summing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num_of_cases = sc.nextLong();
        while (num_of_cases-- > 0) {
            long sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += sc.nextLong();
            }
            System.out.println(sum);
        }
        sc.close();
    }
}