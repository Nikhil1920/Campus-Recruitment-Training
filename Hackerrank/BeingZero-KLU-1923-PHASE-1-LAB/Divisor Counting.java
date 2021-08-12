import java.util.Scanner;

class DivisorCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            long count = 0;
            long num = sc.nextLong();
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    if (num / i == i)
                        count++;

                    else
                        count += 2;
                }
            }
            System.out.println(count);
            num_of_cases--;
        }
        sc.close();
    }
}
