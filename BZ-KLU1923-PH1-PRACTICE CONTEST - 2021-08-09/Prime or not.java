import java.util.*;

class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        boolean isPrime = true;
        if (num == 1) {
            isPrime = false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Yes" : "No");
        sc.close();
    }
}
