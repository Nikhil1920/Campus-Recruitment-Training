import java.util.Scanner;

class PrimesinARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int temp;
        if (n < m) {
            temp = m;
            m = n;
            n = temp;
        }
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num == 0)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}