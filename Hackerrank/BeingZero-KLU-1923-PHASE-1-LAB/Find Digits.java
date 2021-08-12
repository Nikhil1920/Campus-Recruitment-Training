import java.util.Scanner;

class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int num = sc.nextInt();
            int temp = num;
            int count = 0;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > 0 && num % digit == 0)
                    count++;
                temp = temp / 10;
            }
            System.out.println(count);
            num_of_cases--;
        }
        sc.close();
    }
}