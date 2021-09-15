import java.util.Scanner;

class BIGARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            long n = sc.nextLong();
            long required_sum = sc.nextLong();
            long curr_sum = (n * (n + 1)) / 2;
            long diff = curr_sum - required_sum;
            if (diff <= n && diff > 0) {
                System.out.println(curr_sum - required_sum);
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}