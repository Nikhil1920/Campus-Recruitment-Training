import java.util.Arrays;
import java.util.Scanner;

class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < 4; i++) {
            min += arr[i];
            max += arr[i + 1];
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}