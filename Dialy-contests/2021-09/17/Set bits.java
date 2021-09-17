
// Set bits
import java.util.Scanner;

class SetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int i = l; i <= r; i++) {
                int bitCount = Integer.bitCount(i);
                if (isPrime(bitCount)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;

        for (int i = 5; i * i <= num; i += 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;

        return true;
    }
}