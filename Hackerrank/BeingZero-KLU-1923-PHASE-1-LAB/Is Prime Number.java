import java.util.Scanner;

class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        int case_counter = 1;
        while (num_of_cases > 0) {

            boolean isPrime = true;
            long num = sc.nextLong();
            if (num == 1 || num == 0)
                isPrime = false;
            for (long i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println("Test Case #" + case_counter + ": " + (isPrime ? "YES" : "NO"));
            num_of_cases--;
            case_counter++;
        }
        sc.close();
    }
}