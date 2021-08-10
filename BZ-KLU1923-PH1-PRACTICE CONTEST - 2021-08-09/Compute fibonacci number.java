import java.util.*;

class ComputeFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] fibonacci = new int[num];
        fibonacci[0] = 1;
        if (num > 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < num; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(fibonacci[num - 1]);
        sc.close();
    }
}
