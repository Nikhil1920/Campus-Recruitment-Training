import java.util.*;

class TheMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actual_sum = 0;
        for (int i = 1; i <= 100; i++)
            actual_sum += i;

        int temp;
        int input_sum = 0;
        for (int i = 0; i < 99; i++) {
            temp = sc.nextInt();
            input_sum += temp;
        }
        System.out.println(actual_sum - input_sum);
        sc.close();
    }
}
