import java.util.Arrays;
import java.util.Scanner;

class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        int result = 0;
        int mySum = 0;
        Arrays.sort(array);
        for (int i = n - 1; i >= 0; i--) {
            mySum += array[i];
            sum -= array[i];
            result++;
            if (mySum > sum)
                break;
        }
        System.out.println(result);
        sc.close();
    }
}